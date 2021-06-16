package com.example.safariapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_background_logic.*

class BackgroundLogic : AppCompatActivity() {
    var textValue: String =""
    var intText: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background_logic)

        button7.setOnClickListener {
            textValue = textView5.text.toString()
            intText = Integer.valueOf(textValue)
            //make ref to business logic
            val double = Double()
            //doubling the value
            val values = double.doubled(intText)
            //set the new value to textview
            textView5.text = values.toString()
        }
    }
}