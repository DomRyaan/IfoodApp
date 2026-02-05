package com.exemplo.ifoodreplica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SlideFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SlideFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Infla (Cria) o layout para esse fragmento
        val view = inflater.inflate(R.layout.fragment_slide, container, false)

        // Pega os dados passados para o fragment
        val txtTop = arguments?.getString("ARG_TEXT_TOP")
        val txtBottom = arguments?.getString("ARG_TEXT_BOTTOM")
        val txtSide = arguments?.getString("ARG_TEXT_SIDE")
        val txtView = arguments?.getString("ARG_TEXT_VIEW")


        // Econtra as view do layout
        val textTop: TextView = view.findViewById(R.id.text_top)
        val textBottom: TextView = view.findViewById(R.id.text_bottom)
        val textSide: TextView = view.findViewById(R.id.text_side)
        val textOnView: TextView = view.findViewById(R.id.text_in_view)

        textTop.text = txtTop
        textBottom.text = txtBottom
        textSide.text = txtSide
        textOnView.text = txtView


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param title Parameter 1.
         * @param desc Parameter 2.
         * @return A new instance of fragment SlideFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(textTop: String, textBottom: String, textSide: String, textView: String): SlideFragment {
            val fragment = SlideFragment()
            val args = Bundle().apply {
                putString("ARG_TEXT_TOP", textTop)
                putString("ARG_TEXT_BOTTOM", textBottom)
                putString("ARG_TEXT_SIDE", textSide)
                putString("ARG_TEXT_VIEW", textView)
            }

            fragment.arguments = args

            return fragment
        }
    }
}