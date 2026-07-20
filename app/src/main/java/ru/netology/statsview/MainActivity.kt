package ru.netology.statsview

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.activity.ComponentActivity
import ru.netology.statsview.ui.StatsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.statsView)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F
        )

        val textView = findViewById<TextView>(R.id.label)

        val animation =
            AnimationUtils.loadAnimation(this, R.anim.animation).apply {
                setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationEnd(p0: Animation?) {
                        textView.text = "onAnimationEnd"
                    }

                    override fun onAnimationRepeat(p0: Animation?) {
                        textView.text = "onAnimationRepeat"
                    }

                    override fun onAnimationStart(p0: Animation?) {
                        textView.text = "onAnimationStart"
                    }
                })
            }


//        findViewById<StatsView>(R.id.statsView).startAnimation(
//            AnimationUtils.loadAnimation(this, R.anim.animation)
//        )

        findViewById<StatsView>(R.id.statsView).startAnimation(animation)
    }
}

