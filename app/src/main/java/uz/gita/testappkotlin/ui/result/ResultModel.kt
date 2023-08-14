package uz.gita.testappkotlin.ui.result

import uz.gita.testappkotlin.model.TestData
import uz.gita.testappkotlin.repository.AppRepository

class ResultModel() : ResultContract.Model {

    private val repository :AppRepository = AppRepository.getInstance()
    private val answers : MutableList<String> = repository.getUserAnswers()

    override fun getTests(): MutableList<TestData> {
        return repository.test
    }

    override fun getAnswers() : MutableList<String> {
        return answers
    }
}