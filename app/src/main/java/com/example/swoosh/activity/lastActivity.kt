package com.example.swoosh.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.model.player
import kotlinx.android.synthetic.main.activity_last.*
import com.example.swoosh.utility.EXTRA_PLAYER

class lastActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        val player = intent.getParcelableExtra<player>(EXTRA_PLAYER)


        text1.text = "looking for a ${player.league} ${player.skill}  league near you.... "


    }
}