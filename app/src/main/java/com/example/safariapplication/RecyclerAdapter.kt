package com.example.safariapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_item.view.*

class RecyclerAdapter(private val context: Context, private val studentList: List<RecyclerModel>) : RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapter.RecyclerHolder {
      val inflater = LayoutInflater.from(parent.context).inflate(
          R.layout.custom_item,parent,false
      )
        return RecyclerHolder(inflater)
    }


    override fun getItemCount() = studentList.size

    override fun onBindViewHolder(holder: RecyclerAdapter.RecyclerHolder, position: Int) {
        //create var that will ref the item position
        val items = studentList[position]
        //set data
        holder.imageView.setImageResource(items.image)
        holder.textView.text = items.studentName
        holder.text.text = items.studentAge
        holder.texting.text = items.studentAdmin
    }

    //declare view holder
    class RecyclerHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        //declaring variables to ref the views in recycled item
        val imageView: ImageView = itemView.imageView4
        val textView: TextView = itemView.studentName
        val text: TextView = itemView.studentAge
        val texting: TextView = itemView.SAN
    }
}