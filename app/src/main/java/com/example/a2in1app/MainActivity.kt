package com.example.a2in1app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.result.contract.ActivityResultContracts
import com.example.guessthephrase.GuessThePhrase
import com.example.numbersgameapp.NumbersGame
import kotlinx.android.synthetic.main.activity_guess_the_phrase.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        bt_number.setOnClickListener{

            startGame(NumbersGame())
        }

        bt_phase.setOnClickListener{

            startGame(GuessThePhrase())
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){


            R.id.mi_guess_the_phrase -> {
                startGame(GuessThePhrase())
                return true
            }
            R.id.mi_number_game -> {
                startGame(NumbersGame())
                return true
            }
        }
return super.onOptionsItemSelected(item)
    }


    private fun startGame(activity : Activity){
        val intent = Intent(this , activity::class.java)
        startActivity(intent)
    }


}