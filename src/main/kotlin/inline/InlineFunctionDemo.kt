package inline

fun main() {
    inlineFunction { println("Calling inline function") }
    inlineFunction { println("Calling inline function") }
    inlineFunction { println("Calling inline function") }
}

inline fun inlineFunction(fn: () -> Unit) {
    fn()
    print("Code inside inline function")
}