package lambda

fun main(array: Array<String>) {

    val nationCapital1: Pair<String,String> = Pair("India","New Delhi")
    val nationCapital2: Pair<String,String> = Pair("Pakistan","Islamabad")
    val nationCapital3: Pair<String,String> = Pair("Sri Lanka","Columbo")

    val listOfNations = listOf(nationCapital1,nationCapital2,nationCapital3)

    printKeyValuePairs(listOfNations) { pair -> println("${pair.first}'s capital is ${pair.second}") }

    val listOfNumbers = listOf<Int>(1,2,3,4,56,4,2,23,4,3445,54,334,54,3,67,7)
    val evenNumbers = listOfNumbers.filter { it%2==0 }
    println("Numbers filtered: $evenNumbers")

}

fun printKeyValuePairs(keyValuePairsList: List<Pair<String,String>>, lambda:(Pair<String,String>)->Unit ): Unit{
    keyValuePairsList.forEach(lambda)
}
