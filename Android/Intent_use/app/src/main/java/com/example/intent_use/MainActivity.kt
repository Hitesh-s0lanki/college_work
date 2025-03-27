package com.example.intent_use

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var text:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.text_input)

        button = findViewById(R.id.confirm_button)
        button.setOnClickListener {
            if (text.text == null){
                var toast = Toast.makeText(this, "Please Enter Something in the text field", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 4)
                toast.show()
            }else{
                var intent = Intent(this, Home::class.java)
                intent.putExtra("name", text.text.toString())
                startActivity(intent)
            }
        }



    }
}