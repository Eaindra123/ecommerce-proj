package com.example.ecommerce_kotlin.data.api

import com.example.ecommerce_kotlin.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}