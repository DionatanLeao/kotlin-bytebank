package paradigma_funcional

fun main() {
//    tipoFuncaoReferencia()
//    tipoFuncaoClasse()

    val minhaFuncaoLambda = {
        println("executa com lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

private fun tipoFuncaoClasse() {
    val minhaClasse: () -> Unit = Teste()
    println(minhaClasse())
}

private fun tipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}