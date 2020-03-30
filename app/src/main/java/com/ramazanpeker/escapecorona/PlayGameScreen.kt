package com.ramazanpeker.escapecorona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class PlayGameScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game_screen)
        val intent=intent
        val time=intent.getIntExtra("mod",30)
    }
}
