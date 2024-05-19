package com.man293.kotlin_boilerplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.textfield.TextInputLayout

class SignInActivity : AppCompatActivity() {

    lateinit var emailLayout : TextInputLayout
    lateinit var passLayout : TextInputLayout
    lateinit var btnSignin : AppCompatButton
    lateinit var tvSignup : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        tvSignup = findViewById(R.id.tvSignup)
        tvSignup.setOnClickListener {
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}