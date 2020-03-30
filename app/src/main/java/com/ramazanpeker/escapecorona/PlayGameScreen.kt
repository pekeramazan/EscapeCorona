package com.ramazanpeker.escapecorona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_play_game_screen.*

class PlayGameScreen : AppCompatActivity() {
    var score=0
    var ImageArray=ArrayList<ImageView>()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game_screen)

        val intent=intent
        val time=intent.getIntExtra("mod",30)

        ImageArray.add(imageView1)
        ImageArray.add(imageView2)
        ImageArray.add(imageView3)
        ImageArray.add(imageView4)
        ImageArray.add(imageView5)
        ImageArray.add(imageView6)
        ImageArray.add(imageView7)
        ImageArray.add(imageView8)
        ImageArray.add(imageView9)
        ImageArray.add(imageView10)
        ImageArray.add(imageView11)
        ImageArray.add(imageView12)
        ImageArray.add(imageView13)
        ImageArray.add(imageView14)
        ImageArray.add(imageView15)
        ImageArray.add(imageView16)
        ImageArray.add(imageView17)
        ImageArray.add(imageView18)
        ImageArray.add(imageView19)
        ImageArray.add(imageView20)

    }



   fun increaseScore(view:View)
  {

  }
}
