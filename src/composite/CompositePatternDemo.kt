package designPatterns.composite

fun compositeMain() {

    println("Composite Main:")

    val ceo = Employee("John", "CEO", 30000)
    val headSales = Employee("Robert", "Head Sales", 20000)
    val headMarketing = Employee("Michael", "Head Marketing", 20000)
    val clerk1 = Employee("Laura", "Marketing", 10000)
    val clerk2 = Employee("Bob", "Marketing", 10000)
    val salesExecutive1 = Employee("Richard", "Sales", 10000)
    val salesExecutive2 = Employee("Rob", "Sales", 10000)

    ceo.add(headSales)
    ceo.add(headMarketing)
    headSales.add(salesExecutive1)
    headSales.add(salesExecutive2)
    headMarketing.add(clerk1)
    headMarketing.add(clerk2)

    println(ceo.toString())
    for (e in ceo.subordinates) println(e.toString())
    for (e in headSales.subordinates) println(e.toString())
    for (e in headMarketing.subordinates) println(e.toString())


    println("-")

}