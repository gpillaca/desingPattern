package kotlinExample.factoryMethod

class Pizzeria: IPizzeria {
    override fun createPizza(type: String): Pizza? {
        return when(type) {
            "Peperoni" -> { Pizza(8, "Peperoni")}
            "Hawaiana" -> { Pizza(8, "Hawaiana")}
            "Cheese pizza of peperoni" -> { CheesePizza(12, "Cheese pizza of peperoni")}
            else -> null
        }
    }
}