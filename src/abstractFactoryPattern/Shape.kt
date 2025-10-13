package designPatterns.abstractFactoryPattern

// Abstract Factory Pattern
// "Factory of Factories"

//Shape interface
//Concrete classes implementing the interface
//Inteface contains what the concrete objects will implement
//Factory producer uses the abstract factory to determine which factory to make
//The specific factories then override the abstract factory to determine which specific object instances to create

interface Shape {
    fun draw()
}