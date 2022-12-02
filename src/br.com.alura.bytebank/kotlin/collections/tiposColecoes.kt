package collections

fun main() {
    testaCopia()
    testaColecao()
}

private fun testaCopia() {
    val banco = BancoDeNomes()
//    val nomesSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String>
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Nome1")
//    nomesSalvos.add("Nome2")
    banco.salva("Nome1")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    companion object {
        private val dados = mutableListOf<String>()
    }

    fun salva(nome: String) {
        dados.add(nome)
    }

}

private fun testaColecao() {
    val nomes: MutableCollection<String> = mutableListOf("Nome1", "Nome2", "Nome3", "Nome4", "Nome5")

    nomes.add("Nome6")
    nomes.remove("Nome1")

    nomes.forEach {
        println(it)
    }
}