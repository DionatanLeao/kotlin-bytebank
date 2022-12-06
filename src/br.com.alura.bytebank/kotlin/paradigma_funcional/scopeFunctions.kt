package paradigma_funcional

import modelo.Endereco

fun main() {

    Endereco(logradouro = "rua a", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoMaiusculo ->
            println(enderecoMaiusculo)
        }

    val enderecoComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apto")
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)

}