package solid.computerExample

class Computer(private val keyboard: Keyboard, private val mouse: Mouse) {

    fun turnOn() {
        keyboard.connect()
        mouse.connect()
    }
}