package designPatterns.abstractFactoryPattern


fun abstractFactoryMain () {
    println("Abstract Factory Pattern:")
    val producer = FactoryProducer()
    val shapeFactory1 = producer.getFactory(false)

    val shape1 = shapeFactory1?.getShape("RECTANGLE")
    shape1?.draw()

    val shape2 = shapeFactory1?.getShape("SQUARE")
    shape2?.draw()


    val shapeFactory2 = producer.getFactory(true)
    val shape3 = shapeFactory2?.getShape("RECTANGLE")
    shape3?.draw()

    val shape4 = shapeFactory2?.getShape("SQUARE")
    shape4?.draw()
    println("-")

}

