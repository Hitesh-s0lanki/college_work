package com.example.list_toast

import android.os.Bundle
import android.view.Gravity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var mylist:ListView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        mylist = findViewById(R.id.list_item)

        var country = arrayOf<String>("India", "USA", "New York", "Tokyo")

        mylist.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country)

        mylist.setOnItemClickListener { parent, view, position, id ->
            var toast = Toast.makeText(this, country[position], Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 4)
            toast.show()
        }



    }
}