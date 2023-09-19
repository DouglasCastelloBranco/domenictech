package com.example.domenic_tech_app.views

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.domenic_tech_app.R
import com.example.domenic_tech_app.dados.Aplicacao
import com.example.domenic_tech_app.models.Curso

class GerenciarCursosActivity : AppCompatActivity() {

    private var selectedCurso: Curso? = null
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerenciar_cursos)

        val nomeCurso = findViewById<EditText>(R.id.nomeCurso)
        val descricaoCurso = findViewById<EditText>(R.id.descricaoCurso)
        val precoCurso = findViewById<EditText>(R.id.precoCurso)
        val botaoAdicionar = findViewById<Button>(R.id.botao_adicionar)
        val listView = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            Aplicacao.cursos.map { "${it.nome} - ${it.descricao} - ${it.preco}" }
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val cursoSelecionado = Aplicacao.cursos[position]

            AlertDialog.Builder(this)
                .setTitle("O que você quer fazer?")
                .setPositiveButton("Editar") { _, _ ->
                    val dialogView = LayoutInflater.from(this).inflate(R.layout.edit_curso_dialog, null)
                    val editNome = dialogView.findViewById<EditText>(R.id.editNomeCurso)
                    val editDescricao = dialogView.findViewById<EditText>(R.id.editDescricaoCurso)
                    val editPrecoCurso = dialogView.findViewById<EditText>(R.id.editPrecoCurso)

                    editNome.setText(cursoSelecionado.nome)
                    editDescricao.setText(cursoSelecionado.descricao)
                    editPrecoCurso.setText(cursoSelecionado.preco)

                    AlertDialog.Builder(this)
                        .setTitle("Editar Curso")
                        .setView(dialogView)
                        .setPositiveButton("Salvar") { _, _ ->
                            cursoSelecionado.nome = editNome.text.toString()
                            cursoSelecionado.descricao = editDescricao.text.toString()
                            cursoSelecionado.preco = editPrecoCurso.text.toString()
                            adapter.clear()
                            adapter.addAll(Aplicacao.cursos.map { "${it.nome} - ${it.descricao} - ${it.preco}" })
                            adapter.notifyDataSetChanged()
                        }
                        .setNegativeButton("Cancelar", null)
                        .show()
                }
                .setNegativeButton("Excluir") { _, _ ->
                    AlertDialog.Builder(this)
                        .setTitle("Excluir curso")
                        .setMessage("Tem certeza que deseja excluir este curso?")
                        .setPositiveButton("Sim") { _, _ ->
                            Aplicacao.cursos.removeAt(position)
                            adapter.clear()
                            adapter.addAll(Aplicacao.cursos.map { "${it.nome} - ${it.descricao} - ${it.preco}" })
                            adapter.notifyDataSetChanged()
                        }
                        .setNegativeButton("Não", null)
                        .show()
                }
                .show()
        }

        botaoAdicionar.setOnClickListener {
            val curso = Curso(contador++, nomeCurso.text.toString(), descricaoCurso.text.toString(), precoCurso.text.toString())
            Aplicacao.cursos.add(curso)
            adapter.clear()
            adapter.addAll(Aplicacao.cursos.map { "${it.nome} - ${it.descricao} - ${it.preco}" })
            adapter.notifyDataSetChanged()
        }

        val botaoVoltar = findViewById<Button>(R.id.botao_voltar)

        botaoVoltar.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}