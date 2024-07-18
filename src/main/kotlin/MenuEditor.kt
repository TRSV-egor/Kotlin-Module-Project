class MenuEditor {

    fun openMenuEditor(item: Files) {
        while (true) {
            //TODO Придумать красиво
            println("Вы выбрали ${item.javaClass.simpleName} с именем ${item.fileName}")
            println("0. Переименовать")

            when (item){
                is MenuEnum.Archive -> println("1. Открыть архив")
                is MenuEnum.Note -> println("1. Открыть заметку")
            }

            println("2. Выход")
            when (UserInput.getInt("что вы хотите сделать")) {
                0 -> item.fileName = UserInput.getString("Введите новое имя файла")
                1 -> {
                    when (item) {
                        is MenuEnum.Archive -> {
                            val menuArchiveSelector = MenuSelector()
                            menuArchiveSelector.openMenuSelector(item)
                        }
                        //TODO Вероятно надо открыть типа отдельного окно
                        is MenuEnum.Note -> println("Содержимое заметки\n${item.text}")
                    }
                }

                2 -> break
                else -> {
                    println("Комманда не найдена")
                }
            }
        }
    }

}

