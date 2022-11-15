package teste

import modelo.Endereco

fun safeCall() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua A", complemento = "apto")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
}