package com.example.creamy_peaks.ui.common

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.creamy_peaks.ui.user.LoginActivity
import com.example.creamy_peaks.ui.user.RegisterActivity
import com.example.creamy_peaks.databinding.FragmentWelcomeBinding

class WelcomeFragment : AppCompatActivity() {

    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()

        binding = FragmentWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMasuk.setOnClickListener {
            val intent = Intent(this@WelcomeFragment, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnDaftar.setOnClickListener {
            val intent = Intent(this@WelcomeFragment, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}