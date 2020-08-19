package com.example.swoosh.activity

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.welcome_screen.*

class welcome_screen : basseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)



        btn.setOnClickListener{

            val leagueintent = Intent(this,
                legueoActivity::class.java)

            startActivity(leagueintent)
        }
    }
}