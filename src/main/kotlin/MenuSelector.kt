class MenuSelector {

    //Шаблон для МЕНЮ СО СПИСКОМ
    fun <T : MenuEnum> openMenuSelector(item: T) {



        while (true) {

            print("Вы находитесь в ${item.fullName}")
            if (item is MenuEnum.Archive) println(" с названием ${item.fileName}")

            println("0. ${item.cmdName}")

            item.container.forEachIndexed { index, t ->
                println("${index + 1}. ${t.fileName} ")
            }

            println("${item.container.size + 1}. Выход")

            //TODO Проверить ввод пользователя
            val userInput = UserInput.getInt("число, что вы хотите сделать")
            //ТИПЫ!!

            if (userInput > item.container.size + 1){
                println("Такого пункта меню нет!")
                break
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
