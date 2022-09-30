package collections

fun main() {

    val names = mapOf<String, String>("Bengaluru" to "Karnataka", "Panaji" to "Goa", "Chennai" to "Tamilnadu")
    val names2 = buildMap<String, String> {
        put("Bengaluru", "Karnataka")
        put("Panaji", "Goa")
        put("Chennai", "Tamilnadu")
    }
    val updatedNames = mutableMapOf<String, String>("Bengaluru" to "Karnataka", "Panaji" to "Goa", "Chennai" to "Tamilnadu")
    updatedNames.put("Mumbai", "Maharashtra")
    names.forEach { key, value -> println("$key => $value") }

    val iterator = names2.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println(updatedNames.mapKeys {
        it.key.uppercase()
    })
    println(updatedNames)
}

