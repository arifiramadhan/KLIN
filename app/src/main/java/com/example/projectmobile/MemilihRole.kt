package com.example.projectmobile

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MemilihRole : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.memilih_role)

        val buttonBasicUser = findViewById<Button>(R.id.buttonBasicUser)
        val buttonVolunteer = findViewById<Button>(R.id.buttonVolunteer)
        val buttonMitra = findViewById<Button>(R.id.buttonMitra)

        setButtonText(buttonBasicUser, "Basic User", "Saya ingin meminta bantuan pembersihan")
        setButtonText(buttonVolunteer, "Volunteer", "Saya ingin bekerja paruh waktu untuk membersihkan lingkungan")
        setButtonText(buttonMitra, "Mitra", "Saya merupakan mitra KLIN untuk membersihkan lingkungan")
    }

    private fun setButtonText(button: Button, mainText: String, subText: String) {
        val spannableString = SpannableString("$mainText\n$subText")
        spannableString.setSpan(RelativeSizeSpan(1.5f), 0, mainText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(StyleSpan(Typeface.BOLD), 0, mainText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        button.text = spannableString
    }
}
