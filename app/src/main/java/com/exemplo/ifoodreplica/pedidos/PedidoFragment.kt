package com.exemplo.ifoodreplica.pedidos

import android.graphics.Color
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.exemplo.ifoodreplica.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PedidoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PedidoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pedido, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = view.findViewById<ImageView>(R.id.image_blackwhite)
        val image2 = view.findViewById<ImageView>(R.id.image_blackwhite2)

        val matrix = ColorMatrix()
        matrix.setSaturation(0f)

        val filtroPretoBranco = ColorMatrixColorFilter(matrix)

        image.colorFilter = filtroPretoBranco
        image2.colorFilter = filtroPretoBranco
    }

}