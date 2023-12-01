package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentBoxBinding


class BoxFragment : Fragment(R.layout.fragment_box) {

    private lateinit var binding: FragmentBoxBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBoxBinding.bind(view)
        binding.shtrudelButton.setOnClickListener {
            findNavController().navigate(R.id.action_boxFragment_to_discShtrudel)
        }
        binding.cramblButton.setOnClickListener {
            findNavController().navigate(R.id.action_boxFragment_to_discCrambl)
        }
        binding.pancakesButton.setOnClickListener {
            findNavController().navigate(R.id.action_boxFragment_to_discPancakes)
        }
    }

    }


