package run

fun main() {
    var tutorial = "This is Kotlin Tutorial"
    println(tutorial)
    tutorial = run {
        val tutorial = "This is run function"
        tutorial
    }
    tutorial.run {

    }
    println(tutorial)
}