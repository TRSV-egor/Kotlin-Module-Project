sealed interface MenuEnum {

    val cmdName: String
    val container: MutableList<Files>
    fun add()

    data class Storage(
        override val cmdName: String = "добавить архив",
        override val container: MutableList<Files> = mutableListOf()
    ) : MenuEnum {

        override fun add() {
            this.container.add(Archive.create())
        }


    }

    data class Archive(

        override var fileName: String,
        override var cmdName: String = "создать заметку",
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

    data class Note(
        override var fileName: String,
        var text: String,
    ) : Files {

        companion object {
            fun create(): Note {
                return Note(
                    UserInput.getString("имя заметки"),
                    UserInput.getString("текст заметки")
                )
            }
        }
    }


}