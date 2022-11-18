package array

fun operacoesAgregadoras() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdade = idades.average()
    println("Media: $mediaIdade")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos Maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it > 18 }
    println("Busca: $busca")
}