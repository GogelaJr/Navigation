package com.example.navigation.fragments


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigation.R


class HomeFragment: Fragment(R.layout.fragment_home)  {
    private lateinit var button: Button
    private lateinit var FirstEditText:EditText
    private lateinit var LastEditText:EditText
    private lateinit var BirthEditText:EditText

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button =  view.findViewById(R.id.button3)
        FirstEditText = view.findViewById(R.id.Firstname)
        LastEditText = view.findViewById(R.id.Lastname)
        BirthEditText = view.findViewById(R.id.Birthdate)
        navController = Navigation.findNavController(view)
        button.setOnClickListener{
            var first: String = ""
            var last: String = ""
            var birth: String = ""
            if(FirstEditText.text.toString().isNotEmpty() and LastEditText.text.toString().isNotEmpty() and BirthEditText.text.toString().isNotEmpty()){
                first = FirstEditText.text.toString()
                last = LastEditText.text.toString()
                birth = BirthEditText.text.toString()
            }
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(first, last, birth)

            navController.navigate(action)
        }

    }


}