package com.example.ledscreencalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*
import android.content.Intent
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast


class SplashActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val progressBar: ProgressBar = this.spash_progress_bar
        val startButton: Button = this.button_start
        val waitText: TextView = this.textView_wait

        startButton.setOnClickListener {

            progressBar.visibility = View.VISIBLE
            startButton.visibility = View.GONE
            waitText.visibility = View.VISIBLE

            /* New Handler to start the new-Activity with progress bar
         * and close this Splash-Screen after some seconds.*/
            Handler().postDelayed(Runnable {

                progressBar.visibility = View.GONE

                /* Here to code of new activity*/
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                this@SplashActivity.finish()

            }, SPLASH_DISPLAY_LENGTH.toLong())
        }
    }
}
