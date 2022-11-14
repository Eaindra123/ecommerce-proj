package com.example.ecommerce_kotlin.data.repository

import com.example.ecommerce_kotlin.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}