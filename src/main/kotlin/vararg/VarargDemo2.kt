package vararg

fun main (args: Array<String>) {
    someMethod1 ("3", "as", "you", "know", "this", "works")
}

fun someMethod1 (b: String, vararg a: String) {
    println ("b: " + b)
    for (a_ in a) {
        println (a_)
    }
}

