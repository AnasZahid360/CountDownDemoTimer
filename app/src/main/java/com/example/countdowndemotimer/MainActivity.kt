package com.example.countdowndemotimer

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
val toolbar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.countdowndemotimer.ui.theme.CountDownDemoTimerTheme

class MainActivity : ComponentActivity() {

    private var countDownTimer : CountDownTimer? = null
    private var timerDuration : Long = 60000
    private var pauseOffset : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
       tvTimer.text = "${(timerDuration/1000).toString()}"
        btnStart.setOnClickListener{
            startTimer(pauseOffset)
        }

    }
}