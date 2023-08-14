package uz.gita.testappkotlin.ui.game

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import uz.gita.testappkotlin.R
import uz.gita.testappkotlin.databinding.ActivityGameBinding
import uz.gita.testappkotlin.model.TestData
import uz.gita.testappkotlin.ui.result.InnerResultActivity
import uz.gita.testappkotlin.ui.result.ResultActivity

class GameActivity : AppCompatActivity(), GameContract.View {
    private lateinit var radios: MutableList<RadioButton>
    private lateinit var variants: MutableList<AppCompatTextView>
    private lateinit var presenter: GameContract.Presenter
    private lateinit var questionText: AppCompatTextView
    private lateinit var currentPosText: AppCompatTextView
    private lateinit var buttonSkip: AppCompatButton
    private lateinit var buttonNext: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        loadViews()
        attachClickListener()
        presenter = GamePresenter(this)
    }

    private fun loadViews() {

        radios = mutableListOf()
        radios.add(findViewById(R.id.radio1))
        radios.add(findViewById(R.id.radio2))
        radios.add(findViewById(R.id.radio3))
        radios.add(findViewById(R.id.radio4))

        variants = mutableListOf()
        variants.add(findViewById(R.id.text1))
        variants.add(findViewById(R.id.text2))
        variants.add(findViewById(R.id.text3))
        variants.add(findViewById(R.id.text4))

        questionText = findViewById(R.id.textQuestion)
        currentPosText = findViewById(R.id.textCurrentPos)
        buttonSkip = findViewById(R.id.buttonSkip)
        buttonNext = findViewById(R.id.buttonNext)
    }

    private fun attachClickListener() {
        buttonNext.setOnClickListener { presenter.clickNextButton() }

        buttonSkip.setOnClickListener {
            presenter.clickSkipButton()
            stateNextButton(false)
        }

        findViewById<View>(R.id.buttonBack).setOnClickListener {
            presenter.createNewList()
            finish()
        }

        for (i in radios.indices) {
            radios[i].tag = i
            radios[i].setOnClickListener { v: View ->
                val pos = v.tag as Int
                if (radios[pos].isChecked) {
                    clearOldAnswer()
                    radios[pos].isChecked = true
                    presenter.selectUserAnswer(variants[pos].text.toString())
                }
            }
        }
    }


    override fun clearOldAnswer() {
        for (i in radios.indices) {
            if (radios[i].isChecked)
                radios[i].isChecked = false
        }
    }

    override fun describeTest(testData: TestData, currentPos: Int, totalCount: Int) {
        currentPosText.text = ("$currentPos / $totalCount")
        questionText.text = (testData.question)

        variants[0].text = testData.variant1
        variants[1].text = testData.variant2
        variants[2].text = testData.variant3
        variants[3].text = testData.variant4
    }

    override fun stateNextButton(bool: Boolean) {
        buttonNext.isEnabled = bool
    }

    override fun openResultActivity() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
        finish()
    }
}