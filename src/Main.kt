fun main() {
    val mainClass = Main()
    val result = mainClass.start("hello")
    print(result)
}

class Main {
    fun start(message: String) : String {
        return message
    }
}