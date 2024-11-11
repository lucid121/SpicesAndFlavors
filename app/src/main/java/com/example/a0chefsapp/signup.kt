package com.example.a0chefsapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var signUpButton: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        usernameInput = findViewById(R.id.usernameinput)
        passwordInput = findViewById(R.id.passwordinput)
        signUpButton = findViewById(R.id.signup)

        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)

        signUpButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            with(sharedPreferences.edit()) {
                putString("username", username)
                putString("password", password)
                apply()
            }

            startActivity(Intent(this, login::class.java))
            finish()
        }
    }
}
