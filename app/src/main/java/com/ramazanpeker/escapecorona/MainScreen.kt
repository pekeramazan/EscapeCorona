package com.ramazanpeker.escapecorona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun goSelectModScreen(view: View)
    {
        val intent= Intent(applicationContext,SelectModScreen::class.java)
        startActivity(intent)
    }
    fun howtoplayScreen(view: View)
    {
        val intent= Intent(applicationContext,HowtoPlayScreen()::class.java)
        startActivity(intent)
    }

    fun exitClick(view: View)
    {
        finish();
        System.exit(0);
    }
}
