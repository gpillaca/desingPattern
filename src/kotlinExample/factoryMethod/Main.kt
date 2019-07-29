package kotlinExample.factoryMethod

fun main(args: Array<String>) {
    val pizzeria = Pizzeria()
    val peperoni = pizzeria.createPizza("Peperoni")
    val cheesePizza = pizzeria.createPizza("Cheese pizza of peperoni")
    println(peperoni)
    println(cheesePizza)
}