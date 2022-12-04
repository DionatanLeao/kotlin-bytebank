package paradigma_funcional

fun main() {
    tipoFuncaoAnomima()
}

private fun tipoFuncaoAnomima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("executa como anonima")
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))

    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculadoraBonificacaoAnonima(1100.0))
}