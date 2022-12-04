package paradigma_funcional

fun main() {
    tipoFuncaoLambda()
}

private fun tipoFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        println("executa com lambda")
        a+b
    }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@ { salario ->
        if(salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1000.0))
}