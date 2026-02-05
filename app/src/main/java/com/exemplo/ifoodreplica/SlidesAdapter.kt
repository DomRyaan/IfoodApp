package com.exemplo.ifoodreplica

import android.transition.Slide
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// O Adapter herda de FragmentStateAdapter, que é feito para usar com Fragments no ViewPager2
// Ele recebe a Activity como parâmetro para gerenciar o ciclo de vida dos fragments
class SlidesAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    private val pages = listOf(
        SlideFragment.newInstance(
            "Restaurantes",
            "Pagamento",
            "com",
            "Na Entrega"
        ),
        SlideFragment.newInstance(
            "Restaurantes",
            "Pagamentos",
            "com",
            "Em Casa"
        ),
        SlideFragment.newInstance(
            "Restaurantes",
            "Pagamentos",
            "com",
            "Na Entrega"
        ),
        SlideFragment.newInstance(
            "Restaurantes",
            "Pagamentos",
            "com",
            "Em Casa"
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