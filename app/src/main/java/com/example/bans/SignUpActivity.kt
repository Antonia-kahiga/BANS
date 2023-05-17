package com.example.bans

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class signupActivity : AppCompatActivity() {
    lateinit var Edtusername: EditText
    lateinit var EdtEmail: EditText
    private lateinit var EdtPass: EditText
    private lateinit var EdtConPass: EditText
    private lateinit var BtnSignup: Button
    lateinit var TvDirectLogin: TextView
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)
        Edtusername = findViewById(R.id.username)
        EdtEmail = findViewById(R.id.username_ek3)
        EdtPass = findViewById(R.id.username_ek2)
        EdtConPass = findViewById(R.id.username_ek1)
        BtnSignup = findViewById(R.id.sign_up)
        TvDirectLogin = findViewById(R.id.go_to__login)
        auth = Firebase.auth

        BtnSignup.setOnClickListener {
            signUpUser()
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
            finish()

        }
        TvDirectLogin.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
    private fun signUpUser(){
        val username=Edtusername.text.toString()
        val email=EdtEmail.text.toString()
        val pass=EdtPass.text.toString()
        val confirmpass=EdtConPass.text.toString()
        if (username.isBlank() || email.isBlank() || pass.isBlank() || confirmpass.isBlank()){
            Toast.makeText(this,"Please enter all required details", Toast.LENGTH_LONG).show()
            return
        }  else if (pass != confirmpass){
            Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
            return

        }

        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Signed successfully", Toast.LENGTH_LONG).show()
                finish()
            }else{
                Toast.makeText(this,"Failed to create", Toast.LENGTH_LONG).show()
            }
        }
    }
}