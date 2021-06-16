package com.example.safariapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        //setting the list items for my recyclerview
        val listRecycler = generateStaticList()
        //connect widgets to the adapter
        recyclerView.adapter = RecyclerAdapter(this,listRecycler)
        //setting layout
        recyclerView.layoutManager = LinearLayoutManager(this)
        //state the recyclerview item size
        recyclerView.setHasFixedSize(true)
    }
    private fun generateStaticList() : List<RecyclerModel>{
        //array list to add data
        val studentList = ArrayList<RecyclerModel>()
        //add data to model
        studentList.add(RecyclerModel(R.drawable.groot,"Nathan","20","8199"))
        studentList.add(RecyclerModel(R.drawable.groot,"James","17","3892"))
        studentList.add(RecyclerModel(R.drawable.groot,"Peter","22","8209"))
        studentList.add(RecyclerModel(R.drawable.groot,"Mary","20","9883"))

        return studentList
    }
}