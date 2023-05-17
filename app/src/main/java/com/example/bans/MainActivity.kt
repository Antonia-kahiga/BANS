package com.example.bans

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    lateinit var buttontocontinue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttontocontinue=findViewById(R.id.__txt_coninue)
        buttontocontinue.setOnClickListener {
            val intent = Intent(this@MainActivity,signupActivity::class.java)
            startActivity(intent)
        }
    }
}