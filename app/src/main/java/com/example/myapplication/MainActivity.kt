package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val courses = ArrayList<Course>()
        courses.add(Course("Bachelor of Science(Computer Science)"))
        courses.add(Course("Bachelor of Science(Information and Technology)"))
        val adapter = CourseAdapter(courses)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}