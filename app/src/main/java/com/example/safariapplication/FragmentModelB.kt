package com.example.safariapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class FragmentModelB : Fragment() {
    lateinit var model: SharedViewModel
    lateinit var textData: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_model_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model= ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        textData = view.findViewById(R.id.ViewText)
        model.message.observe(viewLifecycleOwner,  Observer {
            textData.text = it
        })
    }

}