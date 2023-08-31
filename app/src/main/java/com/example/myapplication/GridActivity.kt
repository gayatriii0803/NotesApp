package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(R.layout.activity_grid)

        val notesCard: CardView = findViewById(R.id.notes)
        notesCard.setOnClickListener {
            // Handle the click on the "Notes" card
            val intent = Intent(this@GridActivity,MainActivity::class.java)
            startActivity(intent)
        }

        val Practical: CardView = findViewById(R.id.practical)
        Practical.setOnClickListener {
            // Handle the click on the "Notes" card
            val intent = Intent(this@GridActivity,MainActivity::class.java)
            startActivity(intent)
        }

        val Syllabus: CardView = findViewById(R.id.syllabus)
        Syllabus.setOnClickListener {
            // Handle the click on the "Notes" card
            val intent = Intent(this@GridActivity,MainActivity::class.java)
            startActivity(intent)
        }

        val Important:CardView = findViewById(R.id.important)
       Important.setOnClickListener {
            // Handle the click on the "Notes" card
            val intent = Intent(this@GridActivity,MainActivity::class.java)
            startActivity(intent)
        }

    }
}