package designPatterns.facade
//hide complexity of system, provide an interface to client
//an interface to existing systems
//facade class "ShapeMaker"

fun facadeMain(){
    println("Facade Pattern:")
    val shapeMaker = ShapeMaker()
    shapeMaker.drawCircle()
    shapeMaker.drawRectangle()
    shapeMaker.drawSquare()
}