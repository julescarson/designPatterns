package designPatterns.visitor

import javax.management.monitor.Monitor

class Computer : ComputerPart {

    val parts = listOf(MonitorScreen(), Keyboard(), Mouse())


    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        for (i in 0..parts.lastIndex) {
            parts[i].accept(computerPartVisitor)
        }
        computerPartVisitor.visit(this)
    }
}