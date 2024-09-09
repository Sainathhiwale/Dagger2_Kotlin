package com.examen.dagger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examen.dagger2_kotlin.databinding.ActivityMainBinding
import javax.inject.Inject

// Dagger 2 Component Factory with @BindsInstance
class MainActivity : AppCompatActivity() {
     @Inject
     lateinit var userRegistrationService: UserRegistrationService
     // consumer request dependency to component



    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val component = DaggerUserRegisterationComponent.builder()
            .notificationServicesModule(NotificationServicesModule(3)).build()
            component.injectMainActivity(this)
        userRegistrationService.registerUser("dummy@gmail.com","123456")

    }
}