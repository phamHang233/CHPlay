package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val horizontalRecyclerView1: RecyclerView = findViewById(R.id.listItems1)
        val horizontalRecyclerView2: RecyclerView = findViewById(R.id.listItems2)
        val horizontalRecyclerView3: RecyclerView = findViewById(R.id.listItems3)
        val appList = mutableListOf(
            AppItem("App 1", 4.5f),
            AppItem("App 2", 3.9f),
            AppItem("App 3", 4.1f),
            AppItem("App 4", 4.8f),
            AppItem("App 5", 3.7f),
        )
        val appList2 = mutableListOf(
            AppItem("App 6", 4.9f),
            AppItem("App 7", 5f),
            AppItem("App 8", 4.6f),
            AppItem("App 9", 3.8f),
            AppItem("App 10", 4.7f),
        )
        val appList3 = mutableListOf(
            AppItem("App 11", 4.9f),
            AppItem("App 12", 5f),
            AppItem("App 13", 4.6f),
            AppItem("App 14", 3.8f),
            AppItem("App 15", 4.7f),
        )
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val adapter = AppAdapter(appList)
        horizontalRecyclerView1.layoutManager = layoutManager
        horizontalRecyclerView1.adapter = adapter

        val adapter2 = AppAdapter(appList2)
        horizontalRecyclerView2.layoutManager = layoutManager
        horizontalRecyclerView2.adapter = adapter2

        val adapter3 = AppAdapter(appList3)
        horizontalRecyclerView3.layoutManager = layoutManager
        horizontalRecyclerView3.adapter = adapter3

    }
}