package com.outdoorsy.interview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.outdoorsy.interview.ui.RentalsFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_container, RentalsFragment())
            .commit()
    }
}