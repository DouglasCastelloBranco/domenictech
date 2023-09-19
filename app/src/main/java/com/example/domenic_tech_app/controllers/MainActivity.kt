package com.example.domenic_tech_app.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.domenic_tech_app.R
import com.example.domenic_tech_app.views.Cadastro
import com.example.domenic_tech_app.views.Home

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.btn_login)
        login.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val cadastro = findViewById<ImageButton>(R.id.btn_cadastro_email)
        cadastro.setOnClickListener{
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }

    }
}