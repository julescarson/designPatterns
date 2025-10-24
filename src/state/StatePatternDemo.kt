package designPatterns.state

fun stateMain() {
    println("State Main:")

    val context = Context()
    val startState = StartState()
    startState.doAction(context)
    println("Current state: ${context.state.toString()}")

    val stopState = StopState()
    stopState.doAction(context)
    println("Current state: ${context.state.toString()}")

    println("-")
}