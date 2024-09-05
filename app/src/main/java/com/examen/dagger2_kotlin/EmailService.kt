package com.examen.dagger2_kotlin

import android.util.Log

class EmailService {

    fun sent(to:String,from:String,body:String){
        Log.d("EmailService", "sent: ")
    }
}