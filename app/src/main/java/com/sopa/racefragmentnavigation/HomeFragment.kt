package com.sopa.racefragmentnavigation

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sopa.racefragmentnavigation.databinding.FragmentHomeBinding
import java.util.zip.Inflater


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding= FragmentHomeBinding.inflate(inflater)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragment2,null)
        }
        return binding.root
    }


}