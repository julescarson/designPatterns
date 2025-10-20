package designPatterns.visitor

class ComputerPartDisplayVisitor : ComputerPartVisitor {
    override fun visit(computer: Computer) {
        println("Displaying computer.")
    }
    override fun visit(mouse: Mouse) {
        println("Displaying mouse.")
    }
    override fun visit(keyboard: Keyboard) {
        println("Displaying keyboard.")
    }
    override fun visit(monitor: MonitorScreen) {
        println("Displaying monitor.")
    }
}