package com.example.creamy_peaks.ui.common

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.creamy_peaks.databinding.ActivityWelcomeBinding
import com.example.creamy_peaks.ui.auth.AuthActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnMulai.setOnClickListener {
                val intent = Intent(this@WelcomeActivity, AuthActivity::class.java)
                startActivity(intent)
            }
        }
    }
}