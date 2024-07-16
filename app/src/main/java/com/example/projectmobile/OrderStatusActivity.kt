package com.example.projectmobile

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OrderStatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_status)

        val backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Optional: Add any additional actions you want to perform when back button is pressed
    }
}
