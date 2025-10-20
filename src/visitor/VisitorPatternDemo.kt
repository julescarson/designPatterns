package designPatterns.visitor

fun visitorMain() {
    println("Visitor Main:")
    val computer = Computer()
    computer.accept(ComputerPartDisplayVisitor())
    println("-")
}