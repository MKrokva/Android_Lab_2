package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentBoxBinding
import com.example.myapplication.databinding.ShrudelDiscBinding
import kotlin.concurrent.fixedRateTimer

class discShtrudel : Fragment(R.layout.shrudel_disc) {

    private lateinit var binding: ShrudelDiscBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ShrudelDiscBinding.bind(view)


}}