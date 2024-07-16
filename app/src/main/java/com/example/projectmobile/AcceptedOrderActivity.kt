package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AcceptedOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accepted_order_activity)

        val backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val statusButton = findViewById<TextView>(R.id.status_button)
        statusButton.setOnClickListener {
            val intent = Intent(this, OrderStatusActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Optional: Add any additional actions you want to perform when back button is pressed
    }
}
