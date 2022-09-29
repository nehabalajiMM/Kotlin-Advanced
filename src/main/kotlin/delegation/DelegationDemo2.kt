package delegation

interface Animal {
    fun getType()
}

class DomesticAnimal: Animal{
    override fun getType() {
        println("It is domestic animal")
    }
}

class WildAnimal: Animal{
    override fun getType() {
        println("It is a wild animal")
    }
}

class Tiger(val animal: Animal): Animal by animal

fun main() {
    val sampleAnimal = Tiger(WildAnimal())
    sampleAnimal.getType()
}