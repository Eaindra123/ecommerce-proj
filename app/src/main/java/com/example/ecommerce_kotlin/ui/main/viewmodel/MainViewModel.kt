package com.example.ecommerce_kotlin.ui.main.viewmodel

import androidx.lifecycle.*
import com.example.ecommerce_kotlin.data.repository.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
) : ViewModel() {

    init {
        fetchUsers()
    }

    private fun fetchUsers() {

    }
}