package com.google.brgyonestop.response

import com.google.brgyonestop.models.Users

data class LoginResponse(
    val success: Boolean,
    val message: String,
    val token: String,
    val role: String,
    val user: Users
)