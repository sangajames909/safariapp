package com.example.safariapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentB : Fragment() {
    lateinit var textView: TextView
    var messageShared: String = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        textView = view.findViewById(R.id.TextView8)
        //using arguments function to get shared info from bundle
        messageShared = arguments?.getString("DataShared").toString()
        //set the text shared to textview
        textView.text = messageShared
        return view
    }

}