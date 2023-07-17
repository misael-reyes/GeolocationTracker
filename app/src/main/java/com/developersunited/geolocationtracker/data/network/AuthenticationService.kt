package com.developersunited.geolocationtracker.data.network

import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthenticationService(private val firebase: FirebaseClient) {

    suspend fun registerWithEmailAndPassword(loginBody: LoginBody): Task<AuthResult?> {
       return withContext(Dispatchers.IO) {
           firebase.auth.createUserWithEmailAndPassword(loginBody.email, loginBody.password)
       }
    }

    suspend fun loginWithEmailAndPassword(loginBody: LoginBody): Task<AuthResult?> {
        return withContext(Dispatchers.IO) {
            firebase.auth.createUserWithEmailAndPassword(loginBody.email, loginBody.password)
        }
    }
}