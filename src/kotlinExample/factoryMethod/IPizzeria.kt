package kotlinExample.factoryMethod

interface IPizzeria {
    fun createPizza(type: String): Pizza?
}