package com.ramazanpeker.escapecorona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_play_game_screen.*
import java.util.*
import kotlin.collections.ArrayList

class PlayGameScreen : AppCompatActivity() {
    var score=0
    var ImageArray=ArrayList<ImageView>()
    var handler= Handler()
    var runnable=Runnable{}

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game_screen)

        val intent=intent
        val  takeTime=intent.getIntExtra("mod",30)
        val time=takeTime.toLong()

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
        hideandShowandom()

    object :CountDownTimer(time*1000+500,1000){
        override fun onFinish() {
            timeTXT.text="0"
            handler.removeCallbacks(runnable)
            for(image in ImageArray){
                image.visibility=View.INVISIBLE
            }
            val alert=AlertDialog.Builder(this@PlayGameScreen)
            alert.setTitle(("Oyun Bitti"))
            alert.setMessage("Tekrar Oynamak İster misin ?")
            alert.setPositiveButton("yes"){dialog, which ->
                finish()
                startActivity(intent)
            }
            alert.setNegativeButton("NO"){dialog, which ->
                finish()

            }
            alert.show()

        }

        override fun onTick(millisUntilFinished: Long) {
        timeTXT.text=""+millisUntilFinished/1000
        }

    }.start()


    }



   fun increaseScore(view:View)
  {
      score=score+1;
      scoreText.text=""+score

  }
    fun decreaseScore(view:View)
    {
        score=score-2;
        scoreText.text=""+score

    }


    fun hideandShowandom(){
        runnable=object:Runnable{
            override fun run() {
                for(image in ImageArray){
                    image.visibility=View.INVISIBLE
                }
                val random= Random()
                val randomIndex=random.nextInt(20)
                ImageArray[randomIndex].visibility=View.VISIBLE
                handler.postDelayed(runnable,700)
            }

        }
        handler.post(runnable)

    }
}
