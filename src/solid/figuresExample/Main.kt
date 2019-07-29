package solid.figuresExample

fun main(args: Array<String>) {
    val rectangle = Rectangle(15f, 10f)
    val triangle = Triangle(14f, 15f)
    val presentation = Presentation()

    presentation.print(rectangle)

    presentation.printArea(rectangle)
    presentation.printArea(triangle)
}