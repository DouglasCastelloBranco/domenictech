package com.example.domenic_tech_app.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.domenic_tech_app.R

class Termo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_termo)

        val voltar = findViewById<ImageButton>(R.id.btn_voltar_termo)
        voltar.setOnClickListener{
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
    }
}