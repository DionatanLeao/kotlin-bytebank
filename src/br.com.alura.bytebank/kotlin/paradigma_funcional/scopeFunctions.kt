package paradigma_funcional

import modelo.Endereco

fun main() {
    val endereco = Endereco(logradouro = "rua a", numero = 3184)

    Endereco(logradouro = "rua b", numero = 3185)
        .also { println("Criando endereço") }
        .apply {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoMaiusculo ->
            println(enderecoMaiusculo)
        }

    Endereco(logradouro = "rua c", numero = 3186)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoMaiusculo ->
            println(enderecoMaiusculo)
        }

    run {
        println("execução do run sem extensão")
    }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoMaiusculo ->
        println(enderecoMaiusculo)
    }

    println()

    val enderecoComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apto")
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)

}