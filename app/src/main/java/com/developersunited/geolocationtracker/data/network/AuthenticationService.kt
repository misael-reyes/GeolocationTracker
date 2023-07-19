package com.developersunited.geolocationtracker.data.network

import com.developersunited.geolocationtracker.domain.models.LoginBody
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthenticationService @Inject constructor(private val firebase: FirebaseClient) {

    val firebase1 = firebase
    suspend fun registerWithEmailAndPassword(loginBody: LoginBody): AuthResult? {
        return firebase.auth.createUserWithEmailAndPassword(loginBody.email, loginBody.password).await()
    }

    suspend fun loginWithEmailAndPassword(loginBody: LoginBody): AuthResult? {
        return firebase.auth.createUserWithEmailAndPassword(loginBody.email, loginBody.password).await()
    }
}