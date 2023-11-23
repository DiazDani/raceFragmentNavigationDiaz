package com.sopa.racefragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sopa.racefragmentnavigation.databinding.Fragment3Binding
import com.sopa.racefragmentnavigation.databinding.Fragment4Binding

class Fragment4 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding= Fragment4Binding.inflate(inflater)

        return binding.root
    }
}