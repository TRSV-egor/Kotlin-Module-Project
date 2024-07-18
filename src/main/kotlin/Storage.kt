//object Storage :MenuEnum<Files.Archive> {
object Storage : MenuEnum<Files> {

    override val cmdName: String = "добавить архив"
    override val container: MutableList<Files> = mutableListOf()

    override fun add(){
        this.container.add(Files.Archive.create())
    }


}