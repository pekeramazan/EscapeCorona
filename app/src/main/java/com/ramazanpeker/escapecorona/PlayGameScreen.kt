package com.ramazanpeker.escapecorona

import android.content.Context
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.MotionEvent
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
    private var mediaPlayer: MediaPlayer?=null
    private var mediaPlayer2: MediaPlayer?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var sharedPreferences: SharedPreferences
        var bestScore :Int?=null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game_screen)
        sharedPreferences=this.getSharedPreferences("package com.ramazanpeker.escapecorona",
            Context.MODE_PRIVATE)
        bestScore=sharedPreferences.getInt("bestScore",-1)
        if(bestScore==-1)
        {
            bestScoreText.text="0"
        }
        else
        {
            bestScoreText.text=bestScore.toString();
        }
        mediaPlayer=MediaPlayer.create(this.applicationContext,R.raw.bells)
        mediaPlayer2=MediaPlayer.create(this.applicationContext,R.raw.wrong)

        mediaPlayer?.setOnPreparedListener{
        //
        }
        mediaPlayer2?.setOnPreparedListener{
            //
        }

        val intent=intent
        val  takeTime=intent.getIntExtra("mod",30)
        val takeSpeed=intent.getStringExtra("speed")
        var speed=takeSpeed.toInt()
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
            alert.setTitle((getString(R.string.gameover)))
            alert.setMessage(getString(R.string.doyouwanttoplayagain))
            alert.setPositiveButton(getString(R.string.yes)){ dialog, which ->
                finish()
                startActivity(intent)
            }
            alert.setNegativeButton(getString(R.string.no)){ dialog, which ->
                finish()

            }
            if(bestScore<score) {
                sharedPreferences.edit().putInt("bestScore", score).apply()
            }
            alert.setCancelable(false)
            setFinishOnTouchOutside(false)
            alert.show()





        }

        override fun onTick(millisUntilFinished: Long) {
        timeTXT.text=""+millisUntilFinished/1000
        }

    }.start()

    }

    fun increaseScore(view: View)
    {
        mediaPlayer?.start()
        score=score+1;
        scoreText.text=""+score

    }
    fun decreaseScore(view:View)
    {
        mediaPlayer2?.start()

        score=score-10;
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

                val takeSpeed=intent.getStringExtra("speed")
                var speed=takeSpeed.toLong()
                handler.postDelayed(runnable,speed)

            }

        }
        handler.post(runnable)

    }
}
