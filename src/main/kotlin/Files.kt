sealed interface Files {

    var fileName: String

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

    data class Archive(

        override var fileName: String,
        override var cmdName: String = "создать заметку",
        override var container: MutableList<Note> = mutableListOf()

    ) : Files, MenuEnum<Note> {


        companion object {
            fun create(): Archive {
                return Archive(UserInput.getString("имя архива"))
            }
        }

        override fun add() {
            this.container.add(Note.create())

        }

    }

}
