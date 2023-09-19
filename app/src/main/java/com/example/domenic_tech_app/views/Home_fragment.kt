package com.example.domenic_tech_app.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.domenic_tech_app.R
import com.example.domenic_tech_app.adapters.CursoAdapter
import com.example.domenic_tech_app.dados.Aplicacao

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val HOME_ARG_PARAM1 = "param1"
private const val HOME_ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [home_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class home_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(HOME_ARG_PARAM1)
            param2 = it.getString(HOME_ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_home_fragment, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewCursos)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = CursoAdapter(Aplicacao.cursos)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment home_fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            home_fragment().apply {
                arguments = Bundle().apply {
                    putString(HOME_ARG_PARAM1, param1)
                    putString(HOME_ARG_PARAM2, param2)
                }
            }
    }
}