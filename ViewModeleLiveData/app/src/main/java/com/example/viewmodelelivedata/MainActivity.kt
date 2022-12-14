package com.example.viewmodelelivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelelivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this)
            .get(MainViewModel::class.java)

        mainViewModel.cont.observe(this,){
            binding.textResultado.text = it.toString()
        }

        binding.buttonClique.setOnClickListener{

            mainViewModel.addNum()

        }

        var cont = 0

        binding.textResultado.text = cont.toString()

        binding.buttonClique.setOnClickListener{
        cont++
        binding.textResultado.text = cont.toString()
        }

    }
}