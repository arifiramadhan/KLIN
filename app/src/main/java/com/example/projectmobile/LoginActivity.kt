package com.example.projectmobile

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login_activity)

        auth = FirebaseAuth.getInstance()

        val loginButton = findViewById<Button>(R.id.btnLogin)
        loginButton.setOnClickListener {
            val emailEditText = findViewById<EditText>(R.id.loginUsernameEmailPhone)
            val passwordEditText = findViewById<EditText>(R.id.loginPassword)
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            loginUser(email, password)
        }
    }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Login successful
                    val user = auth.currentUser
                    // Redirect to MemilihRole
                    val intent = Intent(this, MemilihRole::class.java)
                    startActivity(intent)
                    finish() // Close LoginActivity
                } else {
                    // Login failed
                    Log.w("Login", "signInWithEmailAndPassword:failure", task.exception)
                    // Handle login failure (e.g., display an error message)
                }
            }
    }
}
