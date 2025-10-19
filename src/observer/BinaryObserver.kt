package designPatterns.observer
//concrete observer class

class BinaryObserver(subject: Subject) : Observer() {
    init {
        this.subject = subject
        subject.attach(this)
    }

    override fun update() {
        //!! declares it won't be null - otherwise nullpointerexception
        println("Binary String: ${Integer.toBinaryString(subject!!.state)}"  )
    }
}