package solid

data class Rectangle(val base: Float, val height: Float) {

    override fun toString(): String {
        return "Rectangle -> Base: $base, Height: $height"
    }

    fun area(): Float {
        return base * height
    }
}