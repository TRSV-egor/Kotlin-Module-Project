class MenuEditor {

    fun openMenuEditor(item: Files) {
        while (true) {

            println("Вы выбрали ${item.fullName} с именем ${item.fileName}")
            println("0. Переименовать")

            when (item){
                is MenuEnum.Archive -> println("1. Открыть ${item.fullName}")
                is MenuEnum.Note -> println("1. Изменить ${item.fullName}")
            }




            println("2. Выход")
            when (UserInput.getInt("что вы хотите сделать")) {
                2 -> break
                1 -> {
                    when (item) {
                        is MenuEnum.Archive -> {
                            val menuArchiveSelector = MenuSelector()
                            menuArchiveSelector.openMenuSelector(item)
                        }
                        //TODO Вероятно надо открыть типа отдельного окно
                        is MenuEnum.Note -> {
                            println("Содержимое заметки\n${item.text}")
                            val noteMenuEditor = MenuEditor()
                            noteMenuEditor.openMenuEditor(item)
                        }
                    }
                }
                0 -> item.fileName = UserInput.getString("Введите новое имя файла")
                else -> {
                    println("Комманда не найдена")
                }
            }
        }
    }

}

