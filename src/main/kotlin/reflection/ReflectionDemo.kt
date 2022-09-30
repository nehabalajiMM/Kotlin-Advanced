package reflection

class ReflectionDemo {
}

fun main()
{
    val abc = ReflectionDemo::class
    println("This is a class reference $abc")

    val obj = ReflectionDemo()
    println("This is a bounded class reference ${obj::class}")
}