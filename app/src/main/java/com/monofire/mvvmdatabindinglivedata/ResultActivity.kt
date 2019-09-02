package com.monofire.mvvmdatabindinglivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import android.widget.TextView
import android.widget.RatingBar
import android.content.Intent

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //get rating bar object
        val bar = findViewById<RatingBar>(R.id.ratingBar1)
        bar.numStars = 5
        bar.stepSize = 0.5f
        //get text view
        val t = findViewById<TextView>(R.id.textResult)
        //get score
        val b = intent.extras
        val score = b!!.getInt("score")
        //display score
        bar.rating = score.toFloat()
        when (score) {
            0 -> t.text = "You scored 0%, keep learning"
            1 -> t.text = "You have 20%, study better"
            2 -> t.text = "You have 40%, keep learning"
            3 -> t.text = "You have 60%, good attempt"
            4 -> t.text = "You have 80% Hmmmm.. maybe you have been reading a lot of AndroidProgramming quiz"
            5 -> t.text = " Whao, you have 100%, Who are you? An Android Jet brain"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        getMenuInflater().inflate(R.menu.activity_result, menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.action_settings) {
            val settingsIntent = Intent(this, MainActivity::class.java)
            startActivity(settingsIntent)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
