import modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua A")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo = null
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }
}



