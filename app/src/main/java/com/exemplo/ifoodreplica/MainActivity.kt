package com.exemplo.ifoodreplica

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.setupWithNavController
import androidx.core.view.updatePadding
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    lateinit var navView: BottomNavigationView
    lateinit var navHostView: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        navHostView = findViewById(R.id.nav_host)
        navView = findViewById(R.id.nav_view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            navHostView.updatePadding(left = systemBars.left, right = systemBars.right, top = systemBars.top)
            navView.updatePadding(bottom = systemBars.bottom)
            WindowInsetsCompat.CONSUMED
        }

        // Nota: É mais seguro pegar o NavController através do FragmentManager
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment

        val navController = navHostFragment.navController

        navView.setupWithNavController(navController)
    }
}