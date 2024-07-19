sealed interface MenuEnum {

    //Требования к объектам у которых есть меню со списком
    val cmdName: String
    val container: MutableList<Files>
    val fullName: String
    fun add()

    //Начальное ХРАНИЛИЩЕ которое хранит АРХИВЫ
    data class Storage(
        override val cmdName: String = "Добавить архив",
        override val fullName: String = "хранилище архивов",
        override val container: MutableList<Files> = mutableListOf()
    ) : MenuEnum {

        override fun add() {
            this.container.add(Archive.create())
        }


    }

    //АРХИВ который хранит в себе ЗАМЕТКИ
    data class Archive(

        override var fileName: String,
        override var cmdName: String = "Создать заметку",
        override val fullName: String = "архив",
        override var container: MutableList<Files> = mutableListOf()

    ) : Files, MenuEnum {


        companion object {
            fun create(): Archive {
                return Archive(UserInput.getString("имя архива"))
            }
        }

        override fun add() {
            this.container.add(Note.create())

        }

    }

    //ЗАМЕТКА
    data class Note(
        override var fileName: String,
        var text: String,
        override val fullName: String = "заметку"
    ) : Files {

        companion object {
            fun create(): Note {
                return Note(
                    UserInput.getString("имя заметки"),
                    UserInput.getString("текст заметки")
                )
            }
        }

        fun menu(item: Note) {
            while (true) {
                UserInput.separateLine()
                println("Меню заметки:")
                println(
                    "1. Прочитать ${item.fullName}" +
                            "\n2. Перезаписать ${item.fullName}" +
                            "\n3. Добавить в ${item.fullName}" +
                            "\n4. Выход"
                )
                UserInput.separateLine()

                when (UserInput.getInt("что требуется сделать?")) {
                    1 -> {
                        UserInput.separateLine()
                        println("Заметка:${item.fileName}\n\n ${item.text} \n")

                        UserInput.getString("Введите любой символ и нажмите Enter чтобы выйти из режима простмотра")
                    }

                    2 -> item.text = UserInput.getString("Введите новый текст заметки")
                    3 -> item.text += UserInput.getString("Введите что дополнить в заметку:\n ${item.text}")
                    4 -> break
                }
            }
        }
    }


}