package com.example.genshinhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.genshinhelper.databinding.SelectionFragmentBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SelectionFragment : Fragment() {

    private var _binding: SelectionFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SelectionFragmentBinding.inflate(inflater, container, false)
        return binding.root

        binding.Characters.layoutManager = LinearLayoutManager(this)
        binding.Characters.setHasFixedSize(true)
        
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}