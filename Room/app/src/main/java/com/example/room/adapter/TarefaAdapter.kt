package com.example.room.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.room.R

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    class TarefaViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val textnome = view.findViewById<TextView>(R.id.textNome)
        val textsobrenome = view.findViewById<TextView>(R.id.textSobrenome)
        val textidade = view.findViewById<TextView>(R.id.textIdade)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout, parent, false)

        return TarefaViewHolder(layoutAdapter)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa  = listTarefa
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}