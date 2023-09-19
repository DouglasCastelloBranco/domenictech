package com.example.domenic_tech_app.dados

import com.example.domenic_tech_app.models.Curso

object Aplicacao {
    var cursos = mutableListOf(
        Curso(1, "Engenharia Elétrica", "Carga horária: 40 horas. Módulos: 10", "Preço: R\$ 250,00"),
        Curso(2, "Engenharia Mecânica", "Carga horária: 35 horas. Módulos: 12", "Preço: R\$ 200,00")
    )
}
