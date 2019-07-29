package solid.computerExample

open class Mouse: IMouse {
    override fun connect() {
        println("Mouse connection via USB")
    }
}