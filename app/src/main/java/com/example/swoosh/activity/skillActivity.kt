package com.example.swoosh.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.swoosh.R
import com.example.swoosh.model.player
import com.example.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class skillActivity : basseActivity() {



    lateinit var player: player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

         player = intent.getParcelableExtra(EXTRA_PLAYER)



    }
    fun finishonclick (view: View){

        if (begbtn.isChecked || ballbtn.isChecked == true){

            val finishintent = Intent(this,lastActivity::class.java)
            finishintent.putExtra(EXTRA_PLAYER,player)

            startActivity(finishintent)




        }else {

            Toast.makeText(this,"choose a league...",Toast.LENGTH_SHORT).show()
        }


    }

    fun beginonclick (view: View){

        ballbtn.isChecked = false
       player.skill = "Beginner"

    }

    fun balonclick (view: View){

        begbtn.isChecked = false
        player.skill = "Ball"

    }



}