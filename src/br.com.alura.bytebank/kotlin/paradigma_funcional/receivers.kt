package paradigma_funcional

fun main() {
    somaReceiver(1, 5,  resultado = {
        println(this)
    })
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    val total = a+b
    total.resultado()
    println("depois da soma")

}

