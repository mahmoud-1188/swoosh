package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class legueoActivity : basseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legueo)
    }

    fun back (View:View){

        val skillscreen = Intent(this, skillActivity::class.java)

        startActivity(skillscreen)


    }
}