package com.example.safariapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_linear_layout.*

class LinearLayout : AppCompatActivity() {
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        btn = findViewById(R.id.button)

        //set on click listener
       button.setOnClickListener(View.OnClickListener {
            val intentNavigation = Intent(this@LinearLayout,NavigationDrawerActivity::class.java)
            startActivity(intentNavigation)
        })

    }
}