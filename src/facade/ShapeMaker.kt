package designPatterns.facade

class ShapeMaker {
    val circle = Circle()
    val rectangle = Rectangle()
    val square = Square()

    fun drawCircle() {
        circle.draw()
    }
    fun drawRectangle() {
        rectangle.draw()
    }
    fun drawSquare() {
        square.draw()
    }

}