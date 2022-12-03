package paradigma_funcional

fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaClasse: () -> Unit = Teste()
    println(minhaClasse())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}