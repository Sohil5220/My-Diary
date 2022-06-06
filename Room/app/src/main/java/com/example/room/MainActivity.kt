package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: TitleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayAll()
        val button: Button = findViewById(R.id.add_button)
        button.setOnClickListener {
            editTextView()
        }
//        viewModel = ViewModelProvider(this).get(TitleViewModel::class.java)
//        viewModel.allTitles.observe(this, Observer{})



    }
    fun displayAll(){

    }
}