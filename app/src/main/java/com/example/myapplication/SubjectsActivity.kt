package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SubjectsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var subjectAdapter: SubjectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val subjects = listOf("Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5")
        subjectAdapter = SubjectAdapter(subjects)
        recyclerView.adapter = subjectAdapter
    }
}