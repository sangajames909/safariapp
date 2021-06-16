package com.example.safariapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel(){
    //define mutablelivedata 0bject to hold data
    val message = MutableLiveData<String>()
    //function to capture data to be shared
    fun sendMessage(text: String){
        message.value = text
    }
}