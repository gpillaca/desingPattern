package kotlinExample.simpleFactory

fun main(args: Array<String>) {
    val pizzeria = Pizzeria()
    val pizza = pizzeria.createMediumPizza()
    println(pizza)
}