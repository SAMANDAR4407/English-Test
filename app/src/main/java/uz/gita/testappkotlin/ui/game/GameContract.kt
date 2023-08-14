package uz.gita.testappkotlin.ui.game

import uz.gita.testappkotlin.model.TestData

interface GameContract {
    interface Model {
        fun check(userAnswer : String)
        fun saveUserAnswer(userAnswer : String)
        fun setCurrentPos(currentPos : Int)
        fun getCurrentPos() : Int
        fun getTotalCount() : Int
        fun getNextTest() : TestData
        fun hasQuestion() : Boolean
        fun createNewList()
    }
    interface Presenter {
        fun setCurrentPos(currentPos: Int)
        fun clickSkipButton()
        fun clickNextButton()
        fun selectUserAnswer(userAnswer: String?)
        fun checkData()
        fun createNewList()
    }
    interface View {
        fun clearOldAnswer()
        fun describeTest(testData: TestData, currentPos: Int, totalCount: Int)
        fun stateNextButton(bool: Boolean)
        fun openResultActivity()
    }
}