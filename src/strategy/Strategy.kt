package designPatterns.strategyPattern

interface Strategy {
    fun doOperation(num1 : Int, num2 : Int) : Int
}