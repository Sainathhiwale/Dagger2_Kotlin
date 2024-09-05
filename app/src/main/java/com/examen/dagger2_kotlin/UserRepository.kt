package com.examen.dagger2_kotlin

import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d("UserRepository", "saveUser: ")
    }
}