package designPatterns.observer

fun observerMain() {

    println("Observer Pattern:")

    val subject = Subject()
    BinaryObserver(subject)
    OctalObserver(subject)
    HexaObserver(subject)

    println("Subject state: ${subject.state}")
    println("First state change : 15")
    subject.state = 15
    println("Second state change : 22")
    subject.state = 22

    println("-")



}