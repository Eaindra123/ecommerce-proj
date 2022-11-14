package com.example.ecommerce_kotlin.data.api

import com.example.ecommerce_kotlin.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/users")
    suspend fun getUsers(): Response<List<User>>

}