package com.example.notes.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.notes.R


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ListOfNotes : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.list_of_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutView = view as LinearLayout

        val titles = resources.getStringArray(R.array.titles)
        val texts = resources.getStringArray(R.array.texts)

        for ((index, title) in titles.withIndex()) {
            val tv1 = TextView(context, null, 0, R.style.TextAppearance_MaterialComponents_Headline6)
            val tv2 = TextView(context, null, 0, R.style.TextAppearance_MaterialComponents_Body1)
            tv1.text = title
            tv2.text = texts[index]
            layoutView.addView(tv1)
            layoutView.addView(tv2)
        }
    }
}
