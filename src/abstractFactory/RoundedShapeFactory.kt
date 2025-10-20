package designPatterns.abstractFactoryPattern

class RoundedShapeFactory : AbstractFactory() {
    override fun getShape(shapeType: String): Shape? {
        return when (shapeType) {
            "RECTANGLE" -> RoundedRectangle()
            "SQUARE" -> RoundedSquare()
            else -> null
        }
    }
}