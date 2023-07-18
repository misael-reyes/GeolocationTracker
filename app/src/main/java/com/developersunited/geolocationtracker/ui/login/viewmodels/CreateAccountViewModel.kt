package com.developersunited.geolocationtracker.ui.login.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.developersunited.geolocationtracker.data.network.AuthenticationService
import com.developersunited.geolocationtracker.data.network.FirebaseClient
import com.developersunited.geolocationtracker.data.repository.AuthRepository
import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.developersunited.geolocationtracker.domain.usecase.RegisterUserBasicUseCase
import kotlinx.coroutines.launch

class CreateAccountViewModel() :
    ViewModel() {

    private val firebaseClient = FirebaseClient
    private val authenticationService = AuthenticationService(firebaseClient)
    private val authRepository = AuthRepository(authenticationService)
    private val registerUserBasicUseCase =  RegisterUserBasicUseCase(authRepository)
    fun registerWithEmailAndPass(loginBody: LoginBody) {
        viewModelScope.launch {
            registerUserBasicUseCase(loginBody).addOnCompleteListener {result ->
                if (result.isSuccessful){
                    Log.i("success","true")
                }else{
                    Log.i("success","false")
                }
            }
        }
    }
}