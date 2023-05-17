package com.example.bans

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MyAccountActivity : AppCompatActivity(){
    lateinit var buttonHome: ImageButton
    lateinit var buttonChat: ImageButton
    lateinit var buttonNotification: ImageButton
    lateinit var buttonAccount: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_account_activity)

        buttonHome = findViewById(R.id.vector_ek2)
        buttonChat = findViewById(R.id.vector_ek2)
        buttonNotification = findViewById(R.id.vector)
        buttonAccount = findViewById(R.id.vector_ek2)

        buttonHome.setOnClickListener {
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
        buttonChat.setOnClickListener {
            val intent = Intent(this,ChatActivity::class.java)
            startActivity(intent)
            finish()
        }
        buttonNotification.setOnClickListener {
            val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }
        buttonAccount.setOnClickListener {
            val intent = Intent(this,MyAccountActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

}