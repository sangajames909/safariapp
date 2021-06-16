package com.example.safariapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText


class FragmentA : Fragment() {
    //tag for interface
    lateinit var communicator: Communicator
    lateinit var editText: TextInputEditText
    lateinit var btn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a,container,false)
        editText = view.findViewById(R.id.edit9)
        btn = view.findViewById(R.id.button9)

        //initialize the interface
        communicator = activity as Communicator
        btn.setOnClickListener {
            val textShared = editText.text.toString()
            communicator.passData(textShared)
        }
        return view
    }

}