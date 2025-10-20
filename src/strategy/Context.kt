package designPatterns.strategyPattern

//ctor in header, rather than in class body (in kotlin)
class Context(val strategy : Strategy) {
    fun executeStrategy(num1 : Int, num2 : Int): Int {
        return strategy.doOperation(num1,num2)
    }

}