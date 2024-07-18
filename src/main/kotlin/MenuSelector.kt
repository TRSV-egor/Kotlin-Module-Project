import java.io.File

class MenuSelector {

//    fun <T : ThisIsFile> openMenuSelector(firstCommand: String, item: MutableList<T>) {
//
//        while (true) {
//
//            println("0. $firstCommand")
//
//            item.forEachIndexed { index, t ->
//                println("${index + 1}. ${t.fileName} ")
//            }
//
//            println("${item.size + 1}. Выход")
//
//            println(item.javaClass.typeName)
//            println(item.javaClass.javaClass)
//            println(item.javaClass.name)
//
//            when (UserInput.getInt("что вы хотите сделать")) {
//
//                0 -> {
//
//                    Storage.addToStorage(Archive.createFile())
//                }
//                (item.size + 1) -> break
//                else -> {
//                    println("Такой комманды нет")
//                }
//            }
//        }
//    }

    //fun <T : MenuEnum<Q>, Q : ThisIsFile> openMenuSelector(item: T) {
    fun <T : MenuEnum<Files>> openMenuSelector(item: T) {
    //fun openMenuSelector(item: Files) {

        while (true) {


            println("0. ${item.cmdName}")

            item.container.forEachIndexed { index, t ->
                println("${index + 1}. ${t.fileName} ")
            }

            println("${item.container.size + 1}. Выход")

            val userInput =  UserInput.getInt("что вы хотите сделать")

            when (userInput) {

                0 -> item.add()
                (item.container.size + 1) -> break

                else -> {
                    if (userInput < item.container.size){
                        val menuEditor = MenuEditor()
                        menuEditor.openMenuEditor(item.container[userInput])
                    } else {
                        println("Такой комманды нет")
                    }

                }
            }
        }
    }

}
