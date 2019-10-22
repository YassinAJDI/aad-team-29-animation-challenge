package com.ajdi.yassin.netfleak.ui.movieDetailsScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ajdi.yassin.netfleak.R
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlinx.android.synthetic.main.activity_movie_details.*

class MovieDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)
        setContentView(R.layout.activity_movie_details)

        val collapsingToolbarLayout = findViewById<View>(R.id.collapsingToolbarLayout1) as CollapsingToolbarLayout
        val appBarLayout = findViewById<AppBarLayout>(R.id.appBarLayout)
        appBarLayout.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
            var isShow = true
            var scrollRange = -1

            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.title = ""
                    movie_title.visibility = View.GONE
                    movie_cat.visibility = View.GONE
                    isShow = true
                } else if (isShow) {
                    collapsingToolbarLayout.title =
                        " "//carefull there should a space between double quote otherwise it wont work
                    isShow = false
                    movie_title.visibility = View.VISIBLE
                    movie_cat.visibility = View.VISIBLE
                }
            }
        })
    }
}
