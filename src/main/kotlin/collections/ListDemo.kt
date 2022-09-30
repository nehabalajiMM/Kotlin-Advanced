package collections

fun main() {

    val names = listOf<String>("abc", "xyz")
    val names2 = buildList<String> {
        add("djd")
        add("jsdb")
    }
    val updatedNames = mutableListOf<String>("abc", "xyz")
    updatedNames.add("ghs")
    updatedNames.add(1, "iahd")
    updatedNames.add("ghs")
    names.forEach{
        println(it)
    }
//    println(names)
    for (name in names2) {
        println(name)
    }
    println(updatedNames)
}