package designPatterns.abstractFactoryPattern

class FactoryProducer {
    fun getFactory (rounded : Boolean) : AbstractFactory {
        return when (rounded) {
            true -> RoundedShapeFactory()
            false -> ShapeFactory()
        }
    }
}