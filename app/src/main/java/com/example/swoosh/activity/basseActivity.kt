package com.example.swoosh.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class basseActivity : AppCompatActivity() {

    val TAG = "lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(TAG,"${javaClass.simpleName} oncreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName} onstart")
        super.onStart()
    }

    override fun onResume() {

        Log.d(TAG,"${javaClass.simpleName} onresume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} onpause")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} onrestart")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} onstop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} ondestroy")
        super.onDestroy()
    }








}