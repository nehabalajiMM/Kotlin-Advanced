package infix

class Hero(firstPower: String) {
    val powers = mutableListOf<String>()
    init {
        powers.add(firstPower)
    }
}