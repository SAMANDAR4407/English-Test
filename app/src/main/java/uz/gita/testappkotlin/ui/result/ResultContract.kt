package uz.gita.testappkotlin.ui.result

import uz.gita.testappkotlin.model.TestData

interface ResultContract {
    interface Model {
        fun getTests() : MutableList<TestData>
        fun getAnswers() : MutableList<String>
    }
    interface Presenter {
        fun getTests() : MutableList<TestData>
        fun getUserAnswer() : MutableList<String>
    }
    interface View {
        fun loadView()
    }
}