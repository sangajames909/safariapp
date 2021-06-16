package com.example.safariapplication

import android.graphics.Insets.add
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_intent_sharing_activity.*
import kotlinx.android.synthetic.main.activity_intent_sharing_b.*

class IntentSharingActivityB : AppCompatActivity() {
    var digit = 0
    var sum: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sharing_b)
        //pick image
        val bundle: Bundle? = intent.extras
        //ref for the new image
        val imagePicked: Int = bundle!!.getInt("imageLogo")
        //set image to imageview
        imageView10.setImageResource(imagePicked)
        //pick text
        val sharedText: String? = intent.getStringExtra("Name")
        val sharedText2: String? = intent.getStringExtra("other name")
        val sharedText3: String? = intent.getStringExtra("digit")

        digit = Integer.valueOf(sharedText3)
        add()

        textView3.append("Name from intent A is" + sharedText + "Other name" + sharedText2 + "sum is" + sharedText3 + sum.toString())
    }
    fun add(){
        digit + digit
    }
}