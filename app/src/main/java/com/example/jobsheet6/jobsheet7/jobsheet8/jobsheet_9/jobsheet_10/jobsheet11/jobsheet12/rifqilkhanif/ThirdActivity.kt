package com.example.jobsheet6.jobsheet7.jobsheet8.jobsheet_9.jobsheet_10.jobsheet11.jobsheet12.rifqilkhanif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnProfile = findViewById<Button>(R.id.buttonprofile)
        val btnSmk = findViewById<Button>(R.id.buttonsmk)

        btnProfile.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnSmk.setOnClickListener {
            val intent = Intent (this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}