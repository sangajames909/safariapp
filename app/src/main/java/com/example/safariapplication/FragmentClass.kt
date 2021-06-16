package com.example.safariapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fragment_class.*

class FragmentClass : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_class)

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,FragmentA()).commit()
        //setting the switch
       // button5.setOnClickListener {
         //   supportFragmentManager.beginTransaction().replace(R.id.frameLayout,FragmentB()).commit()

       // }
    }

    override fun passData(text: String) {
        //initialize ref bundle class
        val bundle = Bundle()
        //saving the info to be shared
        bundle.putString("DataShared",text)
        val trans = this.supportFragmentManager.beginTransaction()
        //set tag for sec frag
        val fragmentb = FragmentB()
        fragmentb.arguments = bundle
        //begin tarns
        trans.replace(R.id.frameLayout,fragmentb)
        trans.commit()
    }
}