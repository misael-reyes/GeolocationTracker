package com.developersunited.geolocationtracker.domain.usecase

import com.developersunited.geolocationtracker.data.repository.AuthRepository
import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import javax.inject.Inject

class RegisterUserBasicUseCase @Inject constructor(private val authRepository: AuthRepository) {

    suspend operator fun invoke(loginBody: LoginBody): Boolean {
        return authRepository.registerWithEmailAndPassword(loginBody) != null
//        val accountCreated =
//            authRepository.registerWithEmailAndPassword(loginBody) != null
//        return if (accountCreated) {
//            //serviceSaveLocalDB()
//            true
//        } else {
//            false
//        }
    }
}