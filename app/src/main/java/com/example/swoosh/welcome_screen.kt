package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.welcome_screen.*

class welcome_screen : basseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)



        btn.setOnClickListener{

            val leagueintent = Intent(this,legueoActivity::class.java)

            startActivity(leagueintent)
        }
    }
}