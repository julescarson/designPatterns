package designPatterns.strategyPattern


fun strategyMain() {

    println("\nStrategy Pattern:")

    //update the context depending on which strategy we want to employ
    var context = Context(OperationAdd())
    println("10+5=" + context.executeStrategy(10, 5))


    context = Context(OperationMultiply())
    println("10*5=" + context.executeStrategy(10, 5))


    context = Context(OperationSubtract())
    println("10-5=" + context.executeStrategy(10, 5))
    println("-")
}