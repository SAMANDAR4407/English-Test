package uz.gita.testappkotlin.ui.result

import uz.gita.testappkotlin.model.TestData

class ResultPresenter(private val view: ResultContract.View) : ResultContract.Presenter {
    private val model : ResultContract.Model = ResultModel()


    override fun getTests(): MutableList<TestData> {
        return model.getTests()
    }

    override fun getUserAnswer(): MutableList<String> {
        return model.getAnswers()
    }
}