package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MitraHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mitra_home)

        val orderItem = findViewById<View>(R.id.order_item)
        orderItem.setOnClickListener {
            val intent = Intent(this, OrderDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
