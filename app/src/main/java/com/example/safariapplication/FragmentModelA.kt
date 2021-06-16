package com.example.safariapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText


class FragmentModelA : Fragment() {
    lateinit var model: SharedViewModel
    lateinit var editText: TextInputEditText
    lateinit var btn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_model_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //view ref from fragmentmodelA
        editText = view.findViewById(R.id.textEdit)
        btn = view.findViewById(R.id.editBtn)
        //create an instance of the shared viewmodel class
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        btn.setOnClickListener {
            val input = editText.text.toString()
            model.sendMessage(input)
        }
    }
}
