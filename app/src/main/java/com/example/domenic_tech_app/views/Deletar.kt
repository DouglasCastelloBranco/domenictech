package com.example.domenic_tech_app.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.domenic_tech_app.controllers.MainActivity
import com.example.domenic_tech_app.R

class Deletar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deletar)


        val deletar = findViewById<Button>(R.id.btn_deletar)
        deletar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val cancelar = findViewById<Button>(R.id.btn_cancelar_deletar)
        cancelar.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}