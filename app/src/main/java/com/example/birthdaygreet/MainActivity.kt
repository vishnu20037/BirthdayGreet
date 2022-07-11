package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createCard(view: View) {
        val name1 = findViewById<EditText>(R.id.inputName)
        val name= name1.editableText.toString()
       val intent= Intent(this, Greeting::class.java)
        intent.putExtra(Greeting.NAME_EXTRA,name)
        startActivity(intent)
        Toast.makeText( this,"Happy Birthday $name", Toast.LENGTH_SHORT).show()
    }

}