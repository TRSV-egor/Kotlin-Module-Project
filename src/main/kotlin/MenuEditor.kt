class MenuEditor {

    fun openMenuEditor(item: Files) {
        while (true) {
            println("Вы выбрали ${item.javaClass.simpleName} с именем ${item.fileName}")
            println("0. Переименовать")

            when (item){
                is Files.Archive -> println("1. Открыть архив")
                is Files.Note -> println("1. Открыть заметку")
            }

            println("2. Выход")
            when (UserInput.getInt("что вы хотите сделать")) {
                0 -> item.fileName = UserInput.getString("Введите новое имя файла")
                1 -> {
                    when (item) {
                        is Files.Archive -> {
                            val menuArchiveSelector = MenuSelector()
                            menuArchiveSelector.openMenuSelector(item = item )
                        }
                        is Files.Note -> println("Содержимое заметки\n${item.text}")
                    }
                    println("1. как-то открыть")
                }

                2 -> break
                else -> {
                    println("Комманда не найдена")
                }
            }
        }
    }

}

