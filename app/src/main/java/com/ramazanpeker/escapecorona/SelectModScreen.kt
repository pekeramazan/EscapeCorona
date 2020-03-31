package com.ramazanpeker.escapecorona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_select_mod_screen.*

lateinit var  slider :SeekBar
lateinit var value:TextView
class SelectModScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_mod_screen)
        slider=findViewById((R.id.seekBar)) as SeekBar
        value=findViewById((R.id.seekBarTXT))
        slider.max=1000
        value.text="700"

        slider.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            value.text=progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            value.text=seekBar.toString()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            //value.text=seekBar.toString()
            }

        })


    }

    fun otuzClick(view: View)
    {
        val intent= Intent(applicationContext,PlayGameScreen::class.java)
        intent.putExtra("mod",30)
        intent.putExtra("speed",value.text)

        startActivity(intent)
    }
    fun altmisClick(view: View)
    {
        val intent= Intent(applicationContext,PlayGameScreen::class.java)
        intent.putExtra("mod",60)
        intent.putExtra("speed",value.text)

        startActivity(intent)
    }
    fun doksanClick(view: View)
    {
        val intent= Intent(applicationContext,PlayGameScreen::class.java)
        intent.putExtra("mod",90)
        intent.putExtra("speed",value.text)

        startActivity(intent)
    }
    fun yuzyirmiClick(view: View)
    {
        val intent= Intent(applicationContext,PlayGameScreen::class.java)
        intent.putExtra("mod",120)
        intent.putExtra("speed",value.text)

        startActivity(intent)
    }

    fun backClick(view: View)
    {
        finish()
    }
}
