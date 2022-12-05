package paradigma_funcional

import modelo.Endereco

fun main() {
//    val endereco = Endereco(logradouro = "rua a", numero = 3185)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoMaiusculo)

    Endereco(logradouro = "rua a", numero = 3185).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let (::println)

    val enderecoComplemento = listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apto")
    ).filter { endereco ->
            endereco.complemento.isNotEmpty()
    }.let(::println)

}

fun recebeString(valor: String) {
    println("Recebe String - $valor")
}

//higher order function
fun teste(teste: Int, bloco: () -> Unit): () -> Unit {
    return {
    }
}