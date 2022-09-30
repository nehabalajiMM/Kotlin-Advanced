import infix.Hero

fun main(args: Array<String>) {
    var spidy = Hero("Crawling")
    spidy showWith "Webbing"
}

infix fun Hero.showWith(power: String) {
    powers.add(power)
    for (p in powers)
        println(p)
}