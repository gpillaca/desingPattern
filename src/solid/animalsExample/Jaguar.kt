package solid.animalsExample

data class Jaguar(val age: Int, val weight: Float): Animal(), IFelineWild {

    override fun sleep() {
        println("Jaguar sleep")
    }

    override fun eat() {
        println("Jaguar eats")
    }

    override fun hunt() {
        println("Jaguar hunts")
    }

    override fun roar() {
        println("Jaguar roars")
    }
}