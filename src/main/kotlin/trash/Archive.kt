package trash//data class Archive (
//
//    override var fileName: String,
//    override var cmdName: String = "создать заметку",
//    override var container: MutableList<Note> = mutableListOf()
//
//) : ThisIsFile, MenuEnum<Note>, Files {
//
//    companion object {
//        fun create(): Archive{return Archive(UserInput.getString("имя архива"))}
//    }
//    override fun add(){
//        this.container.add(Note.create())
//    }
//
////    fun extractFile(title: String): Note?{
////        this.container.forEach {
////            if (it.fileName == title){
////                return it
////            }
////        }
////
////        return null
////    }
//}