package com.example.safariapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_constrait_layout.*

class ConstraitLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrait_layout)
 
        btn_B.setOnClickListener {
            val intent = Intent(this@ConstraitLayout,AssignmentActivity::class.java)
            startActivity(intent)

            btn_3.setOnClickListener {
                Toast.makeText(applicationContext,"Button clicked",Toast.LENGTH_LONG).show()
            }
        }
    }
}