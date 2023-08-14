package uz.gita.testappkotlin.ui.game

class GamePresenter(private val view: GameContract.View) : GameContract.Presenter {
    private val model : GameContract.Model = GameModel()
    private var userAnswer : String = ""

    init {
        loadNextTest()
    }

    private fun loadNextTest(){
        if (model.hasQuestion()) {
            view.clearOldAnswer()
            view.describeTest(model.getNextTest(), model.getCurrentPos(), model.getTotalCount())
        } else {
            view.openResultActivity()
        }
    }

    override fun setCurrentPos(currentPos: Int) {
        model.setCurrentPos(currentPos)
    }

    override fun clickSkipButton() {
        model.saveUserAnswer("Skipped")
        loadNextTest()
    }

    override fun clickNextButton() {
        model.check(userAnswer)
        model.saveUserAnswer(userAnswer)
        loadNextTest()
        view.stateNextButton(false)
    }

    override fun selectUserAnswer(userAnswer: String?) {
        if (userAnswer != null) {
            this.userAnswer = userAnswer
        }
        view.stateNextButton(true)
    }

    override fun checkData() {
        if (model.hasQuestion()) {
            loadNextTest()
            view.stateNextButton(false)
        } else {
            view.openResultActivity()
        }
    }

    override fun createNewList() {
        model.createNewList()
    }

}