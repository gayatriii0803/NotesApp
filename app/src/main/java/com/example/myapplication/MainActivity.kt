package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val courses = ArrayList<Course>()
        courses.add(Course("Bachelor of Science(Computer Science)"))
        courses.add(Course("Bachelor of Science(Information and Technology)"))
        val adapter = CourseAdapter(courses)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

         fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                android.R.id.home -> {
                    onBackPressed() // This method finishes the current activity and returns to the previous one
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }

    }
}