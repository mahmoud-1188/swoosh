package com.example.swoosh.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.utility.EXTRA_LEGUE
import com.example.swoosh.utility.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_last.*

class lastActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        val legue = intent.getStringExtra(EXTRA_LEGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        text1.text = "looking for a $legue $skill  league near you.... "
        println(legue)
        println(skill)

    }
}