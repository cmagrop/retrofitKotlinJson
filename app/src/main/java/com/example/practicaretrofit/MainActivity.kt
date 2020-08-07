package com.example.practicaretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var dataList = ArrayList<DataModel>()
    lateinit var recyclerView: RecyclerView
    lateinit var  adapter: DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycler_view)
        //establecer el adapter -> recyclerView


    }
}