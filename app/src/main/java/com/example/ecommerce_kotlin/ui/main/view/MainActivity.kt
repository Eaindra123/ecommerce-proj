package com.example.ecommerce_kotlin.ui.main.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerce_kotlin.R
import com.example.ecommerce_kotlin.ui.main.adapter.MainAdapter
import com.example.ecommerce_kotlin.ui.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel : MainViewModel by viewModels()
    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
        setupObserver()

    }

    private fun setupUI() {
    }

    private fun setupObserver() {

    }

}
