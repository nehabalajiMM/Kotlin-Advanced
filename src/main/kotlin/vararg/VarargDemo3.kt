package vararg

fun main (args: Array<String>) {
    someMethod3 ("3", "as", "you", "know", "this", "works", c = "what")
}

fun someMethod3 (b: String, vararg a: String, c: String) {
    println ("b: " + b)
    for (a_ in a){
        println(a_)
    }
    println ("c: " + c)
}

