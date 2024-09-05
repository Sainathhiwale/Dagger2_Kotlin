package com.examen.dagger2_kotlin

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.d("UserRepository", "saveUser: ")
    }
}