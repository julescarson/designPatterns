package designPatterns.abstractFactoryPattern

class ShapeFactory : AbstractFactory() {
    override fun getShape(shapeType : String) : Shape? {
        return when (shapeType) {
            "RECTANGLE" -> Rectangle()
            "SQUARE" -> Square()
            else -> null
        }
    }
}