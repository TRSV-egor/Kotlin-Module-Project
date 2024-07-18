import java.util.Scanner

object UserInput {
    fun getString(request: String): String {
        println("Введите $request")
        return Scanner(System.`in`).nextLine()
    }

    fun getInt(request: String): Int {
        println("Введите $request")
        return Scanner(System.`in`).nextInt()
    }
}