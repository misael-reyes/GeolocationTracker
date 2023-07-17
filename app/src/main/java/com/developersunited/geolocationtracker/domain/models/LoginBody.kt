package com.developersunited.geolocationtracker.domain.models

data class LoginBody(
    val email: String = "",
    val password: String = "",
    val provider: ProviderType = ProviderType.BASIC
)