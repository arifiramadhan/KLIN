package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OrderDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        val backButton = findViewById<ImageView>(R.id.back_button)
        val acceptButton = findViewById<Button>(R.id.accept_button)
        val rejectButton = findViewById<Button>(R.id.reject_button)

        backButton.setOnClickListener {
            onBackPressed()
        }

        acceptButton.setOnClickListener {
            val intent = Intent(this, AcceptedOrderActivity::class.java)
            startActivity(intent)
        }

        rejectButton.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Optional: Add any additional actions you want to perform when back button is pressed
    }
}
