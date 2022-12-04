package paradigma_funcional

fun main() {
    tipoFuncaoReferencia()
}
fun tipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

private fun soma(a: Int, b: Int): Int {
    println("executa função soma")
    return a + b
}