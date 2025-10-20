package designPatterns.abstractFactoryPattern

abstract class AbstractFactory {
    abstract fun getShape(shapeType : String) : Shape?
}