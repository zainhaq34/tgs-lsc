package com.example.ledscreencalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar)



        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(Color.WHITE)

        val navController = findNavController(R.id.nav_host_fragment)

        nav_view?.let {
            // Show and control NavBar Button and back button
            NavigationUI.setupWithNavController(toolbar, navController, drawer_layout)
            // Control NavBar function
            NavigationUI.setupWithNavController(it, navController)
        }
    }

    override fun onBackPressed() {
        this.finish()
    }

}
