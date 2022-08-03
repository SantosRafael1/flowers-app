package com.myapp.flowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.myapp.flowers.adapter.ItemAdapter
import com.myapp.flowers.data.Datasource
import com.myapp.flowers.model.Flowers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerV = findViewById<RecyclerView>(R.id.recycler_view)
        val loadData = Datasource().loadData()
        recyclerV.adapter = ItemAdapter(this, loadData)
    }
}