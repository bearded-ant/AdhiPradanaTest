package com.example.adhipradanatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)

        val nav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        nav.itemIconTintList = null
    }
}