
fun main(args: Array<String>) {

//    val note1 = Note(
//        fileName = "My 1st note",
//        text = "Don't forget it"
//    )
//
//    val note2 = Note(
//        fileName = "My 2st note",
//        text = "Don't forget it\nDon't forget it"
//    )
//
//    val note3 = Note(
//        fileName = "My 3st note",
//        text = "Don't forget it\nDon't forget it\nDon't forget it"
//    )
//
//    val archive1 = Archive(
//        fileName = "Супер бекап"
//    )
//    val archive2 = Archive(
//        fileName = "Гипер бекап"
//    )
//
//    archive1.addFile(note1)
//    archive1.addFile(note2)
//    archive1.addFile(note3)

    //Storage.addToStorage(archive1)
    //Storage.addToStorage(archive2)

    val menuSelector = MenuSelector()
    //val menuEditor = MenuEditor()

    println("Добро пожаловать в приложение \"Заметки\"")

    menuSelector.openMenuSelector(Storage)
    //menuSelector.openMenuSelector("Создать заметку", Storage.archives[0].container)
    //menuSelector.openMenuSelector("Создать заметку", Storage.archives[1].container)
    //menuEditor.openMenuEditor(Storage.archives[0])
    //menuEditor.openMenuEditor(Storage.archives[0].container[0])

}