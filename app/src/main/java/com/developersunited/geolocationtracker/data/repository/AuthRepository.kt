package com.developersunited.geolocationtracker.data.repository

import com.developersunited.geolocationtracker.data.network.AuthenticationService
import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthRepository(private val authService: AuthenticationService) {

    suspend fun registerWithEmailAndPassword(loginBody: LoginBody): Task<AuthResult?> {
        return authService.registerWithEmailAndPassword(loginBody)
    }
}