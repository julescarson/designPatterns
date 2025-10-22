package designPatterns.builder

abstract class ColdDrink : Item {
    override fun packing() = Bottle()
    abstract override fun price() : Float
}