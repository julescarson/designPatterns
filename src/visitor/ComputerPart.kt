package designPatterns.visitor

//interface to represent an element
interface ComputerPart {
    fun accept(computerPartVisitor : ComputerPartVisitor)
}