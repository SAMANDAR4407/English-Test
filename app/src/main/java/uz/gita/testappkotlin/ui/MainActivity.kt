package uz.gita.testappkotlin.ui

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import uz.gita.testappkotlin.R
import uz.gita.testappkotlin.ui.game.GameActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        findViewById<Button>(R.id.btn_start).setOnClickListener{
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btn_quit).setOnClickListener { finish() }
        findViewById<TextView>(R.id.pp).movementMethod = LinkMovementMethod.getInstance()
    }

}