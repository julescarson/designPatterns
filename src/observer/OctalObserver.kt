package designPatterns.observer

class OctalObserver(subject : Subject) : Observer() {
    init {
        this.subject = subject
        subject?.attach(this)
    }
    override fun update() {
        println("Octal String: ${Integer.toOctalString(subject!!.state)}")
    }
}