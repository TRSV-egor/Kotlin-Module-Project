class MenuSelector {

    //Шаблон для МЕНЮ СО СПИСКОМ
    fun <T : MenuEnum> openMenuSelector(item: T) {


        while (true) {

            UserInput.separateLine()
            print("Вы находитесь в ${item.fullName}")
            if (item is MenuEnum.Archive) print(" с названием ${item.fileName}")
            println()

            println("0. ${item.cmdName}")

            item.container.forEachIndexed { index, t ->
                println("${index + 1}. ${t.fileName} ")
            }

            println("${item.container.size + 1}. Выход")
            UserInput.separateLine()
            val userInput: Int? = UserInput.getInt("число соответствующее пункту")
            UserInput.separateLine()
            if (userInput == null) {
                continue
            } else if (userInput > item.container.size + 1) {
                println("Такого пункта меню нет!")
                continue
            }

            when (userInput) {

                0 -> item.add()
                (item.container.size + 1) -> break

                else -> {
                    if (userInput <= item.container.size) {
                        val menuEditor = MenuEditor()
                        menuEditor.openMenuEditor(item.container[userInput - 1])
                    } else {
                        println("Такой комманды нет")
                    }

                }
            }
        }
    }

}
