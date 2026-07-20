package ru.netology.statsview

import android.os.Bundle
import androidx.activity.ComponentActivity
import ru.netology.statsview.ui.StatsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.statsView).data = listOf(
            500F,
            500F,
            500F,
            500F
        )
    }
}

