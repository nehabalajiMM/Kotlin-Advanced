package reified

inline fun<reified T> showMessage(marks: Int): T {
    return when (T::class) {
        Int::class -> marks as T
        String::class -> "Congratulations! you scored more than 90%" as T
        else -> "Please enter valid type" as T
    }
}
fun main() {
    val intMarks: Int = showMessage(70) // returning integer value
    val stringMessage: String = showMessage(95) // returning string value
    println("Your marks: $intMarks \nMessage: $stringMessage")
}