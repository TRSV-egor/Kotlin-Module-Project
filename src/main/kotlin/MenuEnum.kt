interface MenuEnum<F> {
    val cmdName: String
    val container: MutableList<F>
    fun add()
}