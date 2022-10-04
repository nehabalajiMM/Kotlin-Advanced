package also

fun main() {
    var m = 1
    m = m.also { it + 1 }.also { it + 1 }
    println(m)
}