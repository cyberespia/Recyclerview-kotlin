package com.mariox.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fila.view.*

class miAdaptador(val misDatos: ArrayList<itemDatos>): RecyclerView.Adapter<miAdaptador.miViewHolder>() {

    //val titulos = listOf("Titulo 1", "Titulo 2", "Titulo 3", "Titulo 4", "Titulo 5", "Titulo 6")


    class miViewHolder(itemVista: View): RecyclerView.ViewHolder(itemVista){

        val titulo: TextView = itemVista.tv1
        val foto: ImageView = itemVista.fotito

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): miViewHolder {

        val vista = LayoutInflater.from(parent.context).inflate(R.layout.fila, parent, false)

        return miViewHolder(vista)
    }

    override fun getItemCount(): Int {

        return misDatos.size
    }

    override fun onBindViewHolder(holder: miViewHolder, position: Int) {

        holder.titulo.text = misDatos[position].titulo
        holder.foto.setImageResource(misDatos[position].img)

        holder.itemView.setOnClickListener { view ->

          //Toast.makeText(view.context, misDatos[position].titulo, Toast.LENGTH_SHORT).show()

             val intent = Intent(view.context, Detalle::class.java)

            intent.putExtra("titulo", misDatos[position].titulo)

            view.context.startActivity(intent)

        }




    }


}