package solid

class Presentation {
    fun print(rectangle: Rectangle) {
        println(rectangle)
    }

    fun printArea(figure: IFigure) {
        println(figure.area())
    }
}