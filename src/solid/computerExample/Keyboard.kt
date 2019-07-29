package solid.computerExample

open class Keyboard: IKeyboard {
    override fun connect() {
        println("Keyboard connection via USB")
    }
}