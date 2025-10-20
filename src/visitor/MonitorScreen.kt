package designPatterns.visitor

class MonitorScreen : ComputerPart {
    override fun accept(computerPartVisitor : ComputerPartVisitor) {
        computerPartVisitor.visit(this)
    }
}