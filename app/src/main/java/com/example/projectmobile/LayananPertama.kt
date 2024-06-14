package com.example.projectmobile

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LayananPertama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layanan_pertama)

        // Toolbar setup
        setSupportActionBar(findViewById(R.id.toolbar))

        // Handle the click on the Next button
        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            // Collect data and perform actions
            collectData()
        }
    }

    private fun collectData() {
        // Collect radio button selection
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)

        val selectedRadioButtonId = radioGroup.checkedRadioButtonId
        if (selectedRadioButtonId == -1) {
            Toast.makeText(this, "Please select a price range", Toast.LENGTH_SHORT).show()
            return
        }

        val selectedRadioButton: RadioButton? = findViewById(selectedRadioButtonId)
        val selectedPriceRange = selectedRadioButton?.text.toString()
        // Handle the collected data
        Toast.makeText(this, "Selected Price Range: $selectedPriceRange", Toast.LENGTH_SHORT).show()

        // Collect notes
        val notes: EditText = findViewById(R.id.notes)
        val notesText = notes.text.toString()
        // Handle the collected data
        Toast.makeText(this, "Notes: $notesText", Toast.LENGTH_SHORT).show()
    }
}
