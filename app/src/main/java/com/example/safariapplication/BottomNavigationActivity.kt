package com.example.safariapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var btn: Button
    private lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        btn = findViewById(R.id.button4)
        bottomNav = findViewById(R.id.bottomNavigationView2)
        bottomNav.setOnNavigationItemSelectedListener(this)
        button4.setOnClickListener {
            Toast.makeText(applicationContext,"button clicked",Toast.LENGTH_LONG).show()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.nav_bottom ->{
                val intentRelative = Intent(this@BottomNavigationActivity,RelativeLayout::class.java)
                startActivity(intentRelative)
            }
            R.id.nav_linear->{
                val intentLinear = Intent(this@BottomNavigationActivity,LinearLayout::class.java)
                startActivity(intentLinear)
            }
            R.id.nav_con ->{
            val intentAssignment = Intent(this@BottomNavigationActivity,AssignmentActivity::class.java)
            startActivity(intentAssignment)
        }
        }
        return true
    }
}