package solid.animals

data class Jaguar(val age: Int, val weight: Float): Animal(), IFeline {

    override fun sleep() {
        println("Jaguar sleep")
    }

    override fun eat() {
        println("Jaguar eats")
    }

    override fun hunt() {
        println("Jaguar hunts")
    }

    override fun meow() {
        throw UnsupportedOperationException("Jaguar doesn't meow")
    }

    override fun roar() {
        println("Jaguar roars")
    }
}