package kotlinExample.simpleFactory

class Pizza(val slice: Int) {
    override fun toString(): String {
        return "Slices: $slice"
    }
}