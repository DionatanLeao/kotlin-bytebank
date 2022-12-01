package collections

fun main() {
    val banco = BancoDeNomes()
//    banco.nomes.add("Nome1")
    banco.salva("Nome1")
    println(banco.nomes)
    println(BancoDeNomes().nomes)

}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

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