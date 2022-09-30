package collections

fun main() {

    val names = setOf<String>("abc", "xyz")
    val names2 = buildSet<String> {
        add("djd")
        add("jsdb")
    }
    val updatedNames = mutableSetOf<String>("abc", "xyz")
    updatedNames.add("ghs")
    updatedNames.add("iahd")
    updatedNames.add("ghs")
    println(names)
    println(names2)
    println(updatedNames)
}