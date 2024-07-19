object UserInput {

    fun getString(request: String): String {
        var result: String
        while (true) {
            println("Введите $request ")
            result = readln()
            if (result == "") {
                println("Ошибка: ввод не может быть пустым");continue
            }
            return result
        }

    }

    fun getInt(request: String): Int? {
        println("Введите $request ")
        return try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            println("Ошибка: введите число!")
            return null
        }

    }

    fun separateLine() {
        println("=======================================")
    }
}