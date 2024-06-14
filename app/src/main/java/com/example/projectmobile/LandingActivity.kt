package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_landing)

        // Set action for sign in button
        findViewById<Button>(R.id.signin)?.setOnClickListener {
            // Add your sign in logic here
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Set action for sign up button
        findViewById<Button>(R.id.signup)?.setOnClickListener {
            // Add your sign up logic here
        }
    }
}
