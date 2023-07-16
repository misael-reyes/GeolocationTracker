package com.developersunited.geolocationtracker.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developersunited.geolocationtracker.R
import com.developersunited.geolocationtracker.databinding.ActivityLetsBinding

class LetsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLetsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLetsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.tvLetsSignUp.setOnClickListener {
            startActivity(Intent(this, CreateAccountActivity::class.java))
        }
        binding.btnSignEmailPassword.setOnClickListener {
            startActivity(Intent(this, LoginAccountActivity::class.java))
        }
    }
}