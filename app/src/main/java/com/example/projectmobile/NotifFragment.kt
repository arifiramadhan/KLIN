package com.example.projectmobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class NotifFragment : Fragment(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    private val buttonStates = mutableMapOf<Int, Boolean>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_notif, container, false)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = childFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // Set up button click listeners
        setUpButtonListeners(rootView)

        // Set up upload button click listener
        val uploadButton = rootView.findViewById<Button>(R.id.upload_button)
        uploadButton.setOnClickListener {
            showUploadSuccessDialog()
        }

        return rootView
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        map.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        map.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

    private fun setUpButtonListeners(rootView: View) {
        val buttons = listOf(
            rootView.findViewById<Button>(R.id.gedung_button),
            rootView.findViewById<Button>(R.id.tempat_ibadah_button),
            rootView.findViewById<Button>(R.id.selokan_button),
            rootView.findViewById<Button>(R.id.kali_button),
            rootView.findViewById<Button>(R.id.rumah_warga_button),
            rootView.findViewById<Button>(R.id.sungai_button),
            rootView.findViewById<Button>(R.id.lapangan_button)
        )

        for (button in buttons) {
            buttonStates[button.id] = false // Initialize state to false (not green)

            button.setOnClickListener {
                val isGreen = buttonStates[button.id] ?: false
                if (isGreen) {
                    // Set to original color
                    button.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.textSecondary))
                } else {
                    // Set to green
                    button.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorPrimary))
                }
                buttonStates[button.id] = !isGreen // Toggle the state
            }
        }
    }

    private fun showUploadSuccessDialog() {
        val dialog = UploadSuccessDialogFragment()
        dialog.show(childFragmentManager, "UploadSuccessDialogFragment")
    }
}
