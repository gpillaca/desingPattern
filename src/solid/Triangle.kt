package solid

data class Triangle(val base: Float, val height: Float): IFigure {
    override fun toString(): String {
        return "Triangle -> Base: $base, Height: $height"
    }

    override fun area(): Float {
        return (base * height) / 2
    }
}