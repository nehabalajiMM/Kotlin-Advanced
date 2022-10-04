package apply

fun main() {
    data class Person(var name: String, var tutorial : String)
    var person = Person("Anupam", "Kotlin")

    person.apply { this.tutorial = "Swift" }
    println(person)
}