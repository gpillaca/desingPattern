package solid.computerExample

class Computer(private val keyboard: IKeyboard, private val mouse: IMouse) {

    fun turnOn() {
        keyboard.connect()
        mouse.connect()
    }
}