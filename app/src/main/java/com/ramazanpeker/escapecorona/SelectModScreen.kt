package com.ramazanpeker.escapecorona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class SelectModScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_mod_screen)

    }

    fun otuzClick(view: View)
    {
        val intent= Intent(applicationContext,SelectModScreen::class.java)
        intent.putExtra("mod",30)
        startActivity(intent)
    }
    fun atmisClick(view: View)
    {
        val intent= Intent(applicationContext,SelectModScreen::class.java)
        intent.putExtra("mod",60)
        startActivity(intent)
    }
    fun doksanClick(view: View)
    {
        val intent= Intent(applicationContext,SelectModScreen::class.java)
        intent.putExtra("mod",90)
        startActivity(intent)
    }
    fun yuzyirmiClick(view: View)
    {
        val intent= Intent(applicationContext,SelectModScreen::class.java)
        intent.putExtra("mod",120)
        startActivity(intent)
    }

    fun backClick(view: View)
    {
        finish()
    }
}
