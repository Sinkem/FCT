package com.example.proyectovacio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectovacio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        helloWorld("Pablo")
    }

    private fun helloWorld(name: String){
        binding.tvHelloWorld.text = getString(R.string.hello_world, name)
    }
}