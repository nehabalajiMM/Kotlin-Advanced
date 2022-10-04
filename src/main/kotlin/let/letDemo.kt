package let

fun main() {
    var str = "Hello World"
    str.let { println("$it!!") }
    println(str)
    var strLength = str.let { "$it function".length }
    println("strLength is $strLength")
}