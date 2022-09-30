package reflection

class Property1(var a: Float){
}
fun main(){
    // Constructor Reference
    val y = ::Property1
    println(y.name)
}