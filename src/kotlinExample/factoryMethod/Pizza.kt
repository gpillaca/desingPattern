package kotlinExample.factoryMethod

open class Pizza(private val slice: Int, private val speciality: String) {
    override fun toString(): String {
        return "Slices: $slice, Especiality: $speciality"
    }
}