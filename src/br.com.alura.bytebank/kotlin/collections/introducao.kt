package collections

fun main() {
    val nomes: List<String> = listOf("Nome1", "Nome2", "Nome3", "Nome4", "Nome5")

    for (nome in nomes) {
        println(nome)
    }

    println(nomes)
    println("Tem o nome Nome4? ${nomes.contains("Nome4")}")
    println("Tamanho da coleção: ${nomes.size}")
}