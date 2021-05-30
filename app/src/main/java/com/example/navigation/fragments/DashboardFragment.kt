package com.example.navigation.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigation.R

class DashboardFragment: Fragment(R.layout.fragment_dashboard){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.Firstname2).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).first
        view.findViewById<TextView>(R.id.Lastname2).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).last
        view.findViewById<TextView>(R.id.Birthdate2).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).birthday
    }
}