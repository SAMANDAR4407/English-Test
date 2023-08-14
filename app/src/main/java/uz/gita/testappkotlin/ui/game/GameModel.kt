package uz.gita.testappkotlin.ui.game

import uz.gita.testappkotlin.model.TestData
import uz.gita.testappkotlin.repository.AppRepository

class GameModel : GameContract.Model {

    private val repository: AppRepository = AppRepository.getInstance()
    private val MAX_COUNT = repository.getTotalCount()
    private var test: MutableList<TestData> = ArrayList()
    private var currentPos = 0
    private var wrongCount = 0
    private var correctCount = 0

    init {
        test = repository.getNeededDataByCount(MAX_COUNT)
    }

    override fun check(userAnswer: String) {
        if (test[currentPos-1].answer == userAnswer)
            correctCount++
        else wrongCount++
    }

    override fun saveUserAnswer(userAnswer: String) {
        repository.saveUserAnswer(userAnswer)
    }

    override fun setCurrentPos(currentPos: Int) {
        this.currentPos = currentPos
    }

    override fun getCurrentPos(): Int {
        return currentPos
    }

    override fun getTotalCount(): Int {
        return MAX_COUNT
    }

    override fun getNextTest(): TestData {
        return test[currentPos++]
    }

    override fun hasQuestion(): Boolean {
        return currentPos < MAX_COUNT
    }

    override fun createNewList() {
        repository.createNewList()
    }
}