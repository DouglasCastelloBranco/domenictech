package com.example.domenic_tech_app.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.domenic_tech_app.controllers.MainActivity
import com.example.domenic_tech_app.R

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val voltar = findViewById<ImageButton>(R.id.btn_voltar_cadastro)
        voltar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val cadastro = findViewById<Button>(R.id.btn_cadastro)
        cadastro.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val termo = findViewById<Button>(R.id.btn_termo)
        termo.setOnClickListener{
            val intent = Intent(this, Termo::class.java)
            startActivity(intent)
        }
    }
}