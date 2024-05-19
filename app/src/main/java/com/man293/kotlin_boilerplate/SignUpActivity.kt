package com.man293.kotlin_boilerplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {

    lateinit var emailLayout : TextInputLayout
    lateinit var usernameLayout : TextInputLayout
    lateinit var passLayout : TextInputLayout
    lateinit var cfPassLayout : TextInputLayout
    lateinit var btnSignup : AppCompatButton
    lateinit var tvSignin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        tvSignin = findViewById(R.id.tvSignin)
        tvSignin.setOnClickListener {
            var intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}