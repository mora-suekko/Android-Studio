package com.example.lab06merei

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab6merei.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4", "Элемент 5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18")
        recyclerView.adapter = MyAdapter(items) { item ->
            Toast.makeText(this, "Вы выбрали: $item", Toast.LENGTH_SHORT).show()
        }
    }
}
