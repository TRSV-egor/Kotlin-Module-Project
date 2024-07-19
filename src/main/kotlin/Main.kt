fun main(args: Array<String>) {

    val menuSelector = MenuSelector()

    println("Добро пожаловать в приложение \"Заметки\"")

    menuSelector.openMenuSelector(MenuEnum.Storage())

    println("Ждём Вас снова, в приложении \"Заметки\"")
}