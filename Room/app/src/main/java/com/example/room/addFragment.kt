package com.example.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.room.data.Usuario
import com.example.room.databinding.FragmentAddBinding

class addFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(layoutInflater, container, false)



        binding.

        return binding.root

    }

    fun verificarCampos(nome: String, sobrenome : String, idade : String) : Boolean{
        return !(nome == "" || sobrenome == "" || idade == "")
    }

    inserirNoBanco(){
        val nome  = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade  = binding.editIdade.text.toString()

        if(verificarCampos(nome, sobrenome, idade)){
            val user = Usuario()
        }
    }

}