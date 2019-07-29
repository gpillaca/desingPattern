package kotlinExample.simpleFactory

class Pizzeria {
    fun createLittlePizza(): Pizza = Pizza(6)
    fun createMediumPizza(): Pizza = Pizza(8)
    fun createLargePizza(): Pizza = Pizza(12)
}