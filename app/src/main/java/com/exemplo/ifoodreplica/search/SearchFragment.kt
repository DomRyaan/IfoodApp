package com.exemplo.ifoodreplica.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.exemplo.ifoodreplica.R

/**
 * A simple [Fragment] subclass.
 * Use the [SearchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchFragment : Fragment() {

    private lateinit var colLinearLayout: LinearLayout
    private lateinit var colLinearLayout2: LinearLayout

    // A estrutura da array dos items são ["nome do produto", "id da imagem: formato string"]
    val  array_cards = arrayListOf(
        arrayListOf("Pizza", "img_pizza_card"),
        arrayListOf("Lanches", "img_burguer"),
        arrayListOf("Japonesa", "img_sushi_card"),
        arrayListOf("Brasileira", "img_brasil_card"),
        arrayListOf("Crepes e Panquecas", "img_cp_card"),
        arrayListOf("Bebidas", "img_bebida_card"),
        arrayListOf("Hot Dogs", "img_hotdog_card"),
        arrayListOf("Açaí", "img_acai_card")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        colLinearLayout = view.findViewById<LinearLayout>(R.id.coluna1)
        colLinearLayout2 = view.findViewById<LinearLayout>(R.id.coluna2)

        val array_cards_col1 = array_cards.size / 2

        for (i in 0 until array_cards.size) {
            if (i % 2 == 0) {
                // Se o número for PAR (0, 2, 4, 6) -> Coluna 1
                makeCards(array_cards[i], colLinearLayout)
            } else {
                // Se o número for ÍMPAR (1, 3, 5, 7) -> Coluna 2
                makeCards(array_cards[i], colLinearLayout2)
            }
        }

    }

    fun makeCards(cardProduto: List<String>, coluna: LinearLayout){
            val cardView = layoutInflater.inflate(R.layout.cards_view, null)

            val texto = cardView.findViewById<TextView>(R.id.text_name_card)
            val image = cardView.findViewById<ImageView>(R.id.image_view_card)

            texto.text = cardProduto[0]
            val imageName = cardProduto[1]

            val resourceId = resources.getIdentifier(
                imageName,
                "drawable",
                context?.packageName
            )

            image.setImageResource(resourceId)

            coluna.addView(cardView)
        }
    }