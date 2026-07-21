package ru.netology.statsview

import android.os.Bundle
import androidx.activity.ComponentActivity
import ru.netology.statsview.ui.StatsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.statsView)
        view.data = listOf(
            250F,
            800F,
            750F,
            200F
        )
    }
}

