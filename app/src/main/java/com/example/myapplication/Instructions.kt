package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Instructions : AppCompatActivity() {

    companion object {

    }

    private lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.button)

        mButton.setOnClickListener {
            val mIntent = Intent(this, Trail::class.java)
        }
    }


}
