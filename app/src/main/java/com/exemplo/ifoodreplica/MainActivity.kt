package com.exemplo.ifoodreplica

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val viewPager: ViewPager2 = findViewById(R.id.slide)
        val tabLayout: TabLayout = findViewById(R.id.tabs)

        // Instancia do Adpater
        val adapter = SlidesAdapter(this)

        // Defini o adapter do viewpager
        viewPager.adapter = adapter

        // Conecta o TabLayout com o viewPager2 para criar os pontinhos
        TabLayoutMediator(tabLayout, viewPager) {
            tab, position ->
            // Não precisa fazer nada, o tabLayout vai gerar os pontinhos automaticamente
        }.attach()

    }
}