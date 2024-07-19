class MenuEditor {

    fun openMenuEditor(item: Files) {
        while (true) {

            UserInput.separateLine()
            println("Вы выбрали ${item.fullName} с именем ${item.fileName}")
            UserInput.separateLine()
            println("0. Переименовать\n1. Открыть ${item.fullName}\n2. Выход")
            UserInput.separateLine()

            when (UserInput.getInt("что вы хотите сделать")) {
                2 -> break
                1 -> {
                    when (item) {
                        is MenuEnum.Archive -> {
                            val menuArchiveSelector = MenuSelector()
                            menuArchiveSelector.openMenuSelector(item)
                        }

                        is MenuEnum.Note -> item.menu(item)
                    }
                }

                0 -> item.changeName(UserInput.getString("Введите новое имя файла"))
                else -> {
                    println("Команда не найдена")
                }
            }
        }
    }
}

