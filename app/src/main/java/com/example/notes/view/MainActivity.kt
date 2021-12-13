package com.example.notes.view

import android.content.res.Configuration
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.notes.R
import com.example.notes.presenter.Logic

import kotlinx.android.synthetic.main.activity_main.*

// requireActivity() - return the FragmentActivity this fragment is currently associated with
// requireContext() - return the Context this fragment is currently associated with
// getActivity - return the FragmentActivity this fragment is currently associated with. May return null if the fragment is associated with a Context instead
// getContext - return the Context this fragment is currently associated with

class MainActivity : AppCompatActivity() {

    val listOfNotes = ListOfNotes()
    val detailsOfNotes = DetailsOfNotes()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        if (fab != null) {
            fab.setOnClickListener { view ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }

        if (getResources().getConfiguration().orientation
            == Configuration.ORIENTATION_LANDSCAPE
        ) {

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_left, listOfNotes)
                .commit();
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_right, detailsOfNotes)
                .commit();
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_left, listOfNotes)
                .commit();
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
