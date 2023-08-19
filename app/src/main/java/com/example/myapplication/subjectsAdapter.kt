package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SubjectAdapter(private val subjects: List<String>) : RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>() {

    class SubjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textSubject: TextView = itemView.findViewById(R.id.textSubject)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_subjects, parent, false)
        return SubjectViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val subject = subjects[position]
        holder.textSubject.text = subject
    }

    override fun getItemCount() = subjects.size
}