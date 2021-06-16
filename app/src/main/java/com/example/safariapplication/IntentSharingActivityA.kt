package com.example.safariapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_intent_sharing_activity.*

class IntentSharingActivityA : AppCompatActivity() {
    var textSample: String =""
    var editText: String =""
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sharing_activity)

        button = findViewById(R.id.btn5)
        button.setOnClickListener {
            //capture data
            editText = editt.text.toString()
            //use intent to start activity
            val intentSharing = Intent(this,IntentSharingActivityB::class.java)
            //intent to share text
            intentSharing.putExtra("Name",editText)
            intentSharing.putExtra("other name","this is ur name")
            intentSharing.putExtra("digit","1")

            //share image
            intentSharing.putExtra("imageLogo",R.drawable.applogo)
            startActivity(intentSharing)
        }
    }
}