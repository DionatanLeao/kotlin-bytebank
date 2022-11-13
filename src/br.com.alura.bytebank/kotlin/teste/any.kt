package teste

import modelo.Endereco

fun any() {
    val endereco = Endereco(
        logradouro = "Rua A",
        complemento = "Casa",
        cep = "00000-700"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Madalena",
        numero = 1000,
        cep = "00000-700"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${endereco.hashCode()}")
}