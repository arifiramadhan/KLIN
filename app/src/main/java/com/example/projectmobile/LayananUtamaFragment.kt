package com.example.projectmobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class LayananUtamaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Menginflate layout untuk fragment ini
        return inflater.inflate(R.layout.fragment_layanan_utama, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView1: ImageView = view.findViewById(R.id.imageViewLayanan1)
        val imageView2: ImageView = view.findViewById(R.id.imageViewLayanan2)
        val imageView3: ImageView = view.findViewById(R.id.imageViewLayanan3)

        imageView1.setOnClickListener {
            val fragment = DetailGambarFragment.newInstance(R.drawable.basic_cleaning)
            parentFragmentManager.beginTransaction()
                ?.replace(R.id.fragment_container, fragment)
                ?.addToBackStack(null)
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                ?.commit()
        }

        imageView2.setOnClickListener {
            val fragment = DetailGambarFragment.newInstance(R.drawable.deep_cleaning)
            parentFragmentManager.beginTransaction()
                ?.replace(R.id.fragment_container, fragment)
                ?.addToBackStack(null)
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                ?.commit()
        }

        imageView3.setOnClickListener {
            val fragment = DetailGambarFragment.newInstance(R.drawable.laundry)
            parentFragmentManager.beginTransaction()
                ?.replace(R.id.fragment_container, fragment)
                ?.addToBackStack(null)
                ?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                ?.commit()
        }
    }
}
