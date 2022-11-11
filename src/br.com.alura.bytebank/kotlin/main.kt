import modelo.Endereco

fun main() {
    val endereco = Endereco(logradouro = "Rua A", complemento = "Casa")
    val enderecoNovo = Endereco(bairro = "Vila Madalena", numero = 1000)

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${endereco.hashCode()}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}