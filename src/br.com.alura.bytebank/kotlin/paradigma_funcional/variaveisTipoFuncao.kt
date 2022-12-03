package paradigma_funcional

fun main() {
    tipoFuncaoReferencia()
    tipoFuncaoClasse()
//    tipoFuncaoLambda()
//    tipoFuncaoAnomima()
}

private fun tipoFuncaoAnomima() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

private fun tipoFuncaoLambda() {
    val minhaFuncaoLambda = {
        println("executa com lambda")
    }
    println(minhaFuncaoLambda())
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