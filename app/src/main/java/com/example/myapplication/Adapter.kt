package com.example.myapplication
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(private val courses:List<Course>) :
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = courses[position]
        println("Binding item at position $position: ${course.name}")
        holder.bind(course)
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, SemesterActivity::class.java)
            // Pass any data you want to the SemestersActivity using intent extras if needed
            context.startActivity(intent)
        }

    }


    override fun getItemCount(): Int = courses.size

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemTextView: TextView = itemView.findViewById(R.id.itemTextView)

        fun bind(course: Course) {
            itemTextView.text = course.name
        }
    }

}