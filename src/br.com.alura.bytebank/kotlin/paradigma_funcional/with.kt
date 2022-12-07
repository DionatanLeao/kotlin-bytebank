package paradigma_funcional

import modelo.Endereco

fun main() {
    with(Endereco()) {
        logradouro = "rua a"
        numero = 3185
        bairro = "Vila A"
        cidade = "itaquaquecetuba"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apto"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }

}