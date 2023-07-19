package com.developersunited.geolocationtracker.ui.login.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.developersunited.geolocationtracker.data.network.AuthenticationService
import com.developersunited.geolocationtracker.data.network.FirebaseClient
import com.developersunited.geolocationtracker.data.repository.AuthRepository
import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.developersunited.geolocationtracker.domain.usecase.RegisterUserBasicUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateAccountViewModel @Inject constructor(
    private val registerUserBasicUseCase: RegisterUserBasicUseCase
) : ViewModel() {

    // private val firebaseClient = FirebaseClient
    // private val authenticationService = AuthenticationService(firebaseClient)
    // private val authRepository = AuthRepository(authenticationService)
    // private val registerUserBasicUseCase =  RegisterUserBasicUseCase(authRepository)
    fun registerWithEmailAndPass(loginBody: LoginBody) {
        viewModelScope.launch {
            val accountCreated = registerUserBasicUseCase(loginBody)
            if (accountCreated) {
                Log.i("success","true")
            } else {
                Log.i("success","false")
            }
        }

    }
}
/*
class CreateAccountViewModelFactory(
    private val registerUserBasicUseCase: RegisterUserBasicUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CreateAccountViewModel(registerUserBasicUseCase) as T
    }
}
*/
