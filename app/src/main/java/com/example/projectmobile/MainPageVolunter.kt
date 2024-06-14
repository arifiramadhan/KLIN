package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainPageVolunter : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_page_volunter)

        auth = FirebaseAuth.getInstance()

        // Check if user is already signed in
        if (auth.currentUser == null) {
            // If not signed in, redirect to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Prevent going back to MainPageVolunter if user presses back button
        }
    }
}
