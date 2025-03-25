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

        val items = listOf(
            ItemData("Элемент 1", R.drawable.kapibara_image),
            ItemData("Элемент 2", R.drawable.ic_launcher_foreground),
            ItemData("Элемент 3", R.drawable.ic_launcher_foreground),
            ItemData("Элемент 4", R.drawable.ic_launcher_foreground)
        )

        recyclerView.adapter = MyAdapter(items) { item ->
            Toast.makeText(this, "Вы выбрали: $item", Toast.LENGTH_SHORT).show()
        }
    }
}
