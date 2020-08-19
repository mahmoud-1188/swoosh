package com.example.swoosh.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utility.EXTRA_LEGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_legueo.*

class legueoActivity : basseActivity() {

    var selectedbtn = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legueo)

    }

    fun back (View:View){
        if(mensbtn.isChecked || womnsbtn.isChecked || coedbtn.isChecked == true) {

            val skillscreen = Intent(this, skillActivity::class.java)
            skillscreen.putExtra(EXTRA_LEGUE, selectedbtn)
            startActivity(skillscreen)



        } else {

            Toast.makeText(this,"please choise league",Toast.LENGTH_SHORT).show()


        }

    }


    fun menonclicked (view: View){

        womnsbtn.isChecked = false
        coedbtn.isChecked = false

        selectedbtn = "mens"





    }

    fun womenonclicked (view: View){

        mensbtn.isChecked = false
        coedbtn.isChecked = false

        selectedbtn = "womans"
    }

    fun coedonclicked (view: View){

        mensbtn.isChecked = false
        womnsbtn.isChecked = false

        selectedbtn = "coed"
    }
}