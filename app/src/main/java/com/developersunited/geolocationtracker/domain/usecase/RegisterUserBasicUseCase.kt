package com.developersunited.geolocationtracker.domain.usecase

import com.developersunited.geolocationtracker.data.repository.AuthRepository
import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

class RegisterUserBasicUseCase(private val authRepository: AuthRepository) {

    suspend operator fun invoke(loginBody: LoginBody): Task<AuthResult?> {
        // TODO: validar credenciales
        return authRepository.registerWithEmailAndPassword(loginBody)
    }
}