package com.exemplo.ifoodreplica.home

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.exemplo.ifoodreplica.R

// O Adapter herda de FragmentStateAdapter, que é feito para usar com Fragments no ViewPager2
// Ele recebe a Activity como parâmetro para gerenciar o ciclo de vida dos fragments
class SlidesAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val pages = listOf(
        SlideFragment.newInstance(
            R.drawable.background_view3
        ),
        SlideFragment.newInstance(
            R.drawable.background_view2
        ),
        SlideFragment.newInstance(
            R.drawable.background_view1
        )
    )

    // Esta método informa ao ViewPage2 quanto páginas existem no total
    override fun getItemCount(): Int {
        return pages.size
    }

    //Esse método é chamado pelo ViewPage2 para obter o fragments de uma posição especifica.
    override fun createFragment(position: Int): Fragment {
            return pages[position]
    }
}