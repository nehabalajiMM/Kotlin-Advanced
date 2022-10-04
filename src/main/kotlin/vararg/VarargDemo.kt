package vararg

fun main (args: Array<String>) {
    someMethod ( "as", "you", "know", "this", "works")
}

fun someMethod (vararg a: String) {
    for (a_ in a) {
        println(a_)
    }
}

