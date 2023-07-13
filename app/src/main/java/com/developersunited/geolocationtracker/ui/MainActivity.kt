package com.developersunited.geolocationtracker.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developersunited.geolocationtracker.R
import com.developersunited.geolocationtracker.ui.login.CreateAccountActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, CreateAccountActivity::class.java))
    }
}