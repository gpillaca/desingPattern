package solid.computerExample

fun main(args: Array<String>) {
    val computer = Computer(Keyboard(), Mouse())
    computer.turnOn()
}