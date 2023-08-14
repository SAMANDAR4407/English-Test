package uz.gita.testappkotlin.ui.result

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import uz.gita.testappkotlin.R

class InnerResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner_result)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        val correctAns = findViewById<TextView>(R.id.correct_answer)
        val userAns = findViewById<TextView>(R.id.user_answer)
        val questionTxt = findViewById<TextView>(R.id.question_in_result)

        val extra = intent.extras
        val question = extra!!.getString("question", "")
        val correct = extra!!.getString("correctAns", "")
        val user = extra!!.getString("userAns", "")

        questionTxt.text = question
        correctAns.text = correct
        userAns.text = user

        findViewById<View>(R.id.btn_okay).setOnClickListener { finish() }
    }
}