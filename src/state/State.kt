package designPatterns.state

interface State {
    fun doAction(context: Context)
}