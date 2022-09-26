package com.example.todoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate")

        val buttonNext = findViewById<Button>(R.id.buttinNext)

        val intentSegunda = Intent(this,SegundaActivity::class.java)

        buttonNext.setOnClickListener{
            startActivity(intentSegunda)

        }

    }

}