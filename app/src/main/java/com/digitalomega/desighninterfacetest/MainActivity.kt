package com.digitalomega.desighninterfacetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalomega.desighninterfacetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bottomNavView.itemIconTintList = null
        binding.bottomNavView.bringToFront()
        binding.centerOrder.bringToFront()
        binding.centerOrder.setOnClickListener {

        }
    }
}