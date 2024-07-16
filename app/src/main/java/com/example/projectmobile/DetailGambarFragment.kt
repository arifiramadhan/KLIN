package com.example.projectmobile

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class DetailGambarFragment : Fragment() {

    // Variable to keep track of button states
    private val buttonStates = mutableMapOf<Int, Boolean>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_gambar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageViewDetail: ImageView = view.findViewById(R.id.imageViewLayananUtama)

        val imageResId = arguments?.getInt("IMAGE_RES_ID") ?: 0
        if (imageResId != 0) {
            imageViewDetail.setImageResource(imageResId)
        }

        // Find buttons by their IDs
        val buttons = listOf(
            view.findViewById<Button>(R.id.button_teras),
            view.findViewById<Button>(R.id.button_ruang_tamu),
            view.findViewById<Button>(R.id.button_kamar_utama),
            view.findViewById<Button>(R.id.button_kamar_anak),
            view.findViewById<Button>(R.id.button_kamar_tamu),
            view.findViewById<Button>(R.id.button_dapur),
            view.findViewById<Button>(R.id.button_garasi),
            view.findViewById<Button>(R.id.button_halaman_depan)
        )

        // Set an OnClickListener on each button
        buttons.forEach { button ->
            button.setOnClickListener {
                val isGreen = buttonStates[button.id] ?: false
                if (isGreen) {
                    // Change the button's background color to original when clicked again
                    button.setBackgroundColor(Color.parseColor("#D6D7D7")) // Replace with your original color
                } else {
                    // Change the button's background color to green with color code #26783D when clicked
                    button.setBackgroundColor(Color.parseColor("#1E7622"))
                }
                // Toggle the state
                buttonStates[button.id] = !isGreen
            }
        }
    }

    companion object {
        fun newInstance(imageResId: Int): DetailGambarFragment {
            val fragment = DetailGambarFragment()
            val args = Bundle()
            args.putInt("IMAGE_RES_ID", imageResId)
            fragment.arguments = args
            return fragment
        }
    }
}
