package designPatterns.observer

class HexaObserver(subject : Subject) : Observer() {
    init {
        this.subject = subject
        subject?.attach(this)
    }
    override fun update() {
        println("Hex String: ${Integer.toHexString(subject!!.state)}")
    }
}