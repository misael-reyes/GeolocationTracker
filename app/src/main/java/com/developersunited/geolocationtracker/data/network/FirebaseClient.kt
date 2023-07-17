package com.developersunited.geolocationtracker.data.network

import com.google.firebase.auth.FirebaseAuth

object FirebaseClient {
    val auth: FirebaseAuth get() = FirebaseAuth.getInstance()
}