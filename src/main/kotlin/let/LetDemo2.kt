package let

fun main() {
    var a = 1
    var b= 2

    a = (a + 2).let { val i = it + b
        i}
    println(a)
}