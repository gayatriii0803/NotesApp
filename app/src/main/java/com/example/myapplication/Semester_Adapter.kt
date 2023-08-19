package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Semester_Adapter(private val semesters: List<String>) :
    RecyclerView.Adapter<Semester_Adapter.SemesterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SemesterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_semester, parent, false)
        return SemesterViewHolder(view)
    }

    override fun onBindViewHolder(holder: SemesterViewHolder, position: Int) {
        holder.bind(semesters[position])
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, SubjectsActivity::class.java)
            // Pass any data you want to the SemestersActivity using intent extras if needed
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int = semesters.size

    class SemesterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val semesterTextView: TextView = itemView.findViewById(R.id.semesterTextView)

        fun bind(semester: String) {
            semesterTextView.text = semester
        }
    }
}







