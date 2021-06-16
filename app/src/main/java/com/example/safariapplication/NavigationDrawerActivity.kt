package com.example.safariapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    //initializing tags for widgets
    private lateinit var drawer: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        //view identity
        drawer = findViewById(R.id.drawer_Layout)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navView = findViewById(R.id.nav_drawer)
        //give nav view a listener
        navView.setNavigationItemSelectedListener(this)
        //hamburger icon
        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        //attach drawer layout to listen to the toggle
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_assignment ->{
                val intentAssignment = Intent(this@NavigationDrawerActivity,AssignmentActivity::class.java)
                startActivity(intentAssignment)
            }
            R.id.nav_relative ->{
                val intentRelative = Intent(this@NavigationDrawerActivity,RelativeLayout::class.java)
                startActivity(intentRelative)
            }
            R.id.nav_linear ->{
               Toast.makeText(applicationContext,"Linear Clicked",Toast.LENGTH_LONG).show()
            }
            R.id.nav_bottomview ->{
                val intentBottom = Intent(this@NavigationDrawerActivity,BottomNavigationActivity::class.java)
                startActivity(intentBottom)
            }
            R.id.nav_recycle ->{
                val intentRecycler = Intent(this@NavigationDrawerActivity,RecyclerviewActivity::class.java)
                startActivity(intentRecycler)
            }
            R.id.nav_intent ->{
                val intentShare= Intent(this@NavigationDrawerActivity,IntentSharingActivityA::class.java)
                startActivity(intentShare)
            }
            R.id.nav_fragment ->{
                val intentFragmnet= Intent(this@NavigationDrawerActivity,FragmentClass::class.java)
                startActivity(intentFragmnet)
            }
            R.id.nav_back ->{
                val intentBackground= Intent(this@NavigationDrawerActivity,BackgroundLogic::class.java)
                startActivity(intentBackground)
            }
            R.id.nav_fragmodel ->{
                val intentFrag= Intent(this@NavigationDrawerActivity,FragmentViewModel::class.java)
                startActivity(intentFrag)
            }




        }
        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }

    }
}