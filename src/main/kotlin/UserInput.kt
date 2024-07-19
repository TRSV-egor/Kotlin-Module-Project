import java.util.InputMismatchException
import java.util.Scanner

object UserInput {
    fun getString(request: String): String {
        var result: String
        while (true) {
            println("Введите $request ")
            result = Scanner(System.`in`).nextLine()
            if (result == "") {
                println("Ошибка: ввод не может быть пустым");continue
            }
            return result
        }

    }

    fun getInt(request: String): Int? {
        println("Введите $request ")
        val result: Int? = try {
            Scanner(System.`in`).nextInt()
        } catch (e: InputMismatchException) {
            println("Ошибка: введите число!")
            return null
        }
        return result
    }

    fun separateLine() {
        println("=======================================")
    }
}