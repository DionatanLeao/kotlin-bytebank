package paradigma_funcional

fun main() {
//    tipoFuncaoReferencia()
//    tipoFuncaoClasse()
    tipoFuncaoLambda()
    tipoFuncaoAnomima()

    val calculaBonificacao: (salario: Double) -> Double = lambda@ { salario ->
        if(salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1000.0))

    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculadoraBonificacaoAnonima(1100.0))
}

private fun tipoFuncaoAnomima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("executa como anonima")
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))
}

private fun tipoFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        println("executa com lambda")
        a+b
    }
    println(minhaFuncaoLambda(15, 10))
}

private fun tipoFuncaoClasse() {
    val minhaClasse: (Int, Int) -> Int = Soma()
    println(minhaClasse(10, 10))
}

private fun tipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

private fun soma(a: Int, b: Int): Int {
    println("executa função soma")
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
       println("executa classe Soma")
        return p1 + p2
    }

}