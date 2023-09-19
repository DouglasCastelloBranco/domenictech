package com.example.domenic_tech_app.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.domenic_tech_app.R
import com.example.domenic_tech_app.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        changeFragment(home_fragment())


        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> changeFragment(home_fragment())
                R.id.meus_cursos -> changeFragment(meus_cursos_fragment())
                R.id.perfil -> changeFragment(perfil_fragment())
                R.id.gerenciar_cursos -> {
                    // Iniciar GerenciarCursosActivity
                    val intent = Intent(this, GerenciarCursosActivity::class.java)
                    startActivity(intent)
                }
                else -> {}
            }
            true
        }

    }

    private fun changeFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}