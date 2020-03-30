package com.ramazanpeker.escapecorona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class HowtoPlayScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_how_to_play_screen)

    }

    fun backClick(view: View)
    {
        finish()

    }
}
