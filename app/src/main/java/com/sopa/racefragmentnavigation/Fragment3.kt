package com.sopa.racefragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sopa.racefragmentnavigation.databinding.Fragment2Binding
import com.sopa.racefragmentnavigation.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding= Fragment3Binding.inflate(inflater)

        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment4,null)
        }

        return binding.root
    }
}