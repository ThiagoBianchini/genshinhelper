package com.example.genshinhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.genshinhelper.adapter.AdapTrav
import com.example.genshinhelper.adapter.TravellerListener
import com.example.genshinhelper.databinding.FragmentSelectionBinding
import com.example.genshinhelper.model.GenshinViewModel
import com.example.genshinhelper.model.Travellers


class SelectionFragment : Fragment() {

    val viewModel: GenshinViewModel by activityViewModels()

    private var _binding: FragmentSelectionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val charAdapter = AdapTrav(
        object : TravellerListener {
            override fun onTravellerClick(position: Int) {

                    navigateto(R.id.action_selectionFragment_to_AlbedoFragment, 0)

            }

        }
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSelectionBinding.inflate(inflater, container, false)
        val view = binding.root
        setup()
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setup() {
        setupRecyclerView()
        setupObservers()
    }

    fun setupObservers(){
        viewModel.listTravellers.observe(viewLifecycleOwner){
            charAdapter.submitList(it)
            binding.travellerList.adapter=charAdapter
        }



    }

    fun navigateto(id: Int, position: Int){

        this.findNavController().navigate(id)
    }
    fun setupRecyclerView() {
        val RV_chars = binding.travellerList
        RV_chars.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        RV_chars.setHasFixedSize(true)

        val character_list: MutableList<Travellers> = mutableListOf()
        charAdapter.submitList(character_list)
        RV_chars.adapter = charAdapter
    }
}