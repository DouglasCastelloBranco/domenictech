package com.example.domenic_tech_app.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.domenic_tech_app.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val MEUS_CURSOS_ARG_PARAM1 = "param1"
private const val MEUS_CURSOS_ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [meus_cursos_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class meus_cursos_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(MEUS_CURSOS_ARG_PARAM1)
            param2 = it.getString(MEUS_CURSOS_ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_meus_cursos_fragment, container, false)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment meus_cursos_fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            meus_cursos_fragment().apply {
                arguments = Bundle().apply {
                    putString(MEUS_CURSOS_ARG_PARAM1, param1)
                    putString(MEUS_CURSOS_ARG_PARAM2, param2)
                }
            }
    }
}