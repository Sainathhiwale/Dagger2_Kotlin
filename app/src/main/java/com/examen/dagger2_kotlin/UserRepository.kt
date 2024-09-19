package com.examen.dagger2_kotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}
class SQLRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("SQLRepository", "saveUser:  $email, $password")
    }
}


class FirebaseRepository @Inject constructor(): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("FirebaseRepository", "saveUser:Saving user to Firebase: $email, $password ")
    }

}