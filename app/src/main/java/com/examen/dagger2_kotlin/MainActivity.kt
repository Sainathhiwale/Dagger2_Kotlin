package com.examen.dagger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.examen.dagger2_kotlin.databinding.ActivityMainBinding
import javax.inject.Inject

// Dagger 2 Component Factory with @BindsInstance
class MainActivity : AppCompatActivity() {
     @Inject
     lateinit var userRegistrationService: UserRegistrationService

     lateinit var emailService: EmailService
     lateinit var emailService2: EmailService
     // consumer request dependency to component
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val component = DaggerUserRegisterationComponent.factory().create(3)
            component.injectMainActivity(this)
        userRegistrationService.registerUser("dummy@gmail.com","123456")
        emailService = component.getEmailService()
        emailService2 = component.getEmailService()
        Log.d("MainActivity", "emailService 1: " + emailService.hashCode())
        Log.d("MainActivity", "emailService 2: " + emailService2.hashCode())

    }
}