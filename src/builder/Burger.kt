package designPatterns.builder

abstract class Burger : Item {
    override fun packing() = Wrapper()
    abstract override fun price(): Float
}