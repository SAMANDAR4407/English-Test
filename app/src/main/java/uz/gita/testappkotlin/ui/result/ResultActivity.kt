package uz.gita.testappkotlin.ui.result

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import uz.gita.testappkotlin.R
import uz.gita.testappkotlin.model.TestData
import uz.gita.testappkotlin.ui.MainActivity

class ResultActivity : AppCompatActivity(), ResultContract.View {

    private val presenter : ResultContract.Presenter = ResultPresenter(this)
    private val answers : MutableList<String> = presenter.getUserAnswer()
    private val test : MutableList<TestData> = presenter.getTests()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        loadView()

    }

    override fun loadView() {

        val inflater = LayoutInflater.from(this)
        val linearLayout = findViewById<LinearLayout>(R.id.container)

        for (i in answers.indices) {
            val view = inflater.inflate(R.layout.item, linearLayout, false) as CardView
            val textView = view.findViewById<TextView>(R.id.textAnswer)
            textView.text = "Question " + (i + 1)
            if (answers[i] != test[i].answer) {
                view.setCardBackgroundColor(Color.parseColor("#FFCF2323"))
            }
            linearLayout.addView(view)
            view.findViewById<View>(R.id.result_item).setOnClickListener {
                val intent = Intent(this, InnerResultActivity::class.java)
                intent.putExtra("question", test[i].question)
                intent.putExtra("correctAns", test[i].answer)
                intent.putExtra("userAns", answers[i])
                startActivity(intent)
            }
        }

        findViewById<Button>(R.id.btn_menu).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}