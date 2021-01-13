package com.punam.weeksixassignmentone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText

    private lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etUsername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            if (etUsername.text.toString()=="softwarica" && etPassword.text.toString()=="coventry"){
                val intent=Intent(this,HomePageActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Welcome to SoftUser",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Please Enter Valid name & Password.",Toast.LENGTH_SHORT).show()
            }
            etUsername.setText("")
            etPassword.setText("")
        }

    }
}