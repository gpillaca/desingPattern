package solid.figuresExample

import solid.figuresExample.IFigure

data class Rectangle(val base: Float, val height: Float): IFigure {

    override fun toString(): String {
        return "Rectangle -> Base: $base, Height: $height"
    }

    override fun area(): Float {
        return base * height
    }
}