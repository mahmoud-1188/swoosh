package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_legueo.*

class legueoActivity : basseActivity() {

    var selectedbtn = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legueo)
    }

    fun back (View:View){
        if(selectedbtn != "") {

            val skillscreen = Intent(this, skillActivity::class.java)
            skillscreen.putExtra(EXTRA_LEGUE, selectedbtn)
            startActivity(skillscreen)



        } else {
            print(selectedbtn)
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