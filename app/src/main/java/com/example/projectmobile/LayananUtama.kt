package com.example.projectmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LayananUtama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Mengatur tampilan activity menggunakan layout dari layanan_utama.xml
        setContentView(R.layout.layanan_utama)
    }
}
