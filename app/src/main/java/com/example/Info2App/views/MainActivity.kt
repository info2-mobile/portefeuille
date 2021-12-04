package com.example.Info2App.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.Info2App.SignInFragment
import com.example.materialdesign.R
import com.example.materialdesign.data.data_source.model.Joueur
import com.example.materialdesign.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // switch from splash theme to app theme
        setTheme(R.style.Theme_MaterialDesign)
        // view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // navigation  icon handler
        binding.toolbar.setNavigationOnClickListener {

            when (binding.navView2.isVisible) {
                true -> binding.navView2.isVisible = false
                else -> binding.navView2.isVisible = true
            }
        }
        // switch between fragments
       supportFragmentManager.beginTransaction().apply {
            replace(R.id.ffFragment, SignInFragment()).commit()

        }

            // toolbar menu
        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.delete -> {
                    // Handle favorite icon press
                    Toast.makeText(this, " delete", Toast.LENGTH_LONG).show()

                    true
                }
                R.id.update -> {
                    // Handle search icon press
                    Toast.makeText(this, " update", Toast.LENGTH_LONG).show()

                    true
                }
                R.id.add -> {
                    // Handle more item (inside overflow menu) press
                    Toast.makeText(this, " add", Toast.LENGTH_LONG).show()

                    true
                }
                else -> false
            }

        }
        // buttom navigation view menu
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.sport -> {
                    // Respond to navigation item 1 click
                    R.id.sport
                    //binding.navView2.itemTextColor.=getColor(R.color.blue_700)
                    Toast.makeText(this," you select the sport fragment",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.music -> {
                    // Respond to navigation item 2 click
                    Toast.makeText(this," you select the music fragment",Toast.LENGTH_LONG).show()

                    true
                }
                R.id.book -> {
                    Toast.makeText(this," you select the book fragment",Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }
    }}