package com.exemplo.ifoodreplica.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.exemplo.ifoodreplica.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager: ViewPager2 = view.findViewById(R.id.slide)
        val tabLayout: TabLayout = view.findViewById(R.id.tabs)

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