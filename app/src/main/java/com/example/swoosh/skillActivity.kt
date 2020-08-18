package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class skillActivity : basseActivity() {

    var  legue = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

       legue = intent.getStringExtra(EXTRA_LEGUE)




    }
}