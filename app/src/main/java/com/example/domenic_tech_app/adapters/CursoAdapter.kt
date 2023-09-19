package com.example.domenic_tech_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.domenic_tech_app.R
import com.example.domenic_tech_app.models.Curso

class CursoAdapter(private val cursos: List<Curso>) : RecyclerView.Adapter<CursoAdapter.CursoViewHolder>() {

    class CursoViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val nomeCurso: TextView = view.findViewById(R.id.nome_curso)
        val descricaoCurso: TextView = view.findViewById(R.id.descricao_curso)
        val precoCurso: TextView = view.findViewById(R.id.preco_curso)
        val cursoImage: ImageView = view.findViewById(R.id.curso_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_curso, parent, false)
        return CursoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CursoViewHolder, position: Int) {
        val curso = cursos[position]
        holder.nomeCurso.text = curso.nome
        holder.descricaoCurso.text = curso.descricao
        holder.precoCurso.text = curso.preco

        // Supondo que você tenha uma forma de mapear cada curso a uma imagem
        val imageResource = when (curso.nome) {
            "Engenharia Elétrica" -> R.drawable.engenharia_eletrica
            "Engenharia Mecânica" -> R.drawable.engenharia_mecanica
            "Engenharia Mecatronica" -> R.drawable.engenharia_mecatronica
            // Adicione outros casos aqui
            else -> R.drawable.ic_gerenciar_cursos  // Uma imagem padrão caso não haja correspondência
        }

        holder.cursoImage.setImageResource(imageResource)
    }

    override fun getItemCount() = cursos.size
}
