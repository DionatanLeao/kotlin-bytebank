package paradigma_funcional

fun main() {
    tipoFuncaoClasse()
}
private fun tipoFuncaoClasse() {
    val minhaClasse: (Int, Int) -> Int = Soma()
    println(minhaClasse(10, 10))
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        println("executa classe Soma")
        return p1 + p2
    }

}