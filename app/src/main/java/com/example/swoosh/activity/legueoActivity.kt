package com.example.swoosh.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.example.swoosh.R
import com.example.swoosh.model.player
import com.example.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_legueo.*

class legueoActivity : basseActivity() {


    var player = player(league = "",skill = "")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legueo)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!

    }


    fun back (View:View){
        if(mensbtn.isChecked || womnsbtn.isChecked || coedbtn.isChecked == true) {

            val skillscreen = Intent(this, skillActivity::class.java)
            skillscreen.putExtra(EXTRA_PLAYER,player)
            startActivity(skillscreen)



        } else {

            Toast.makeText(this,"please choise league",Toast.LENGTH_SHORT).show()


        }

    }


    fun menonclicked (view: View){

        womnsbtn.isChecked = false
        coedbtn.isChecked = false

      player.league = "mens"





    }

    fun womenonclicked (view: View){

        mensbtn.isChecked = false
        coedbtn.isChecked = false

        player.league = "womans"
    }

    fun coedonclicked (view: View){

        mensbtn.isChecked = false
        womnsbtn.isChecked = false

        player.league = "coed"
    }
}