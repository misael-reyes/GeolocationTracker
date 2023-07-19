package com.developersunited.geolocationtracker.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.viewModelFactory
import com.developersunited.geolocationtracker.R
import com.developersunited.geolocationtracker.data.network.AuthenticationService
import com.developersunited.geolocationtracker.data.network.FirebaseClient
import com.developersunited.geolocationtracker.data.repository.AuthRepository
import com.developersunited.geolocationtracker.databinding.ActivityCreateAccountBinding
import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.developersunited.geolocationtracker.domain.usecase.RegisterUserBasicUseCase
import com.developersunited.geolocationtracker.ui.login.viewmodels.CreateAccountViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateAccountBinding

    private val viewModel: CreateAccountViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.btnSignUp.setOnClickListener {
            viewModel.registerWithEmailAndPass(
                LoginBody(
                    binding.etEmailCreateAccount.text.toString(),
                    binding.etPassCreateAccount.text.toString()
                )
            )
            //startActivity(Intent(this, FillProfileActivity::class.java))
        }
    }
}