package paradigma_funcional

import modelo.Endereco

fun main() {
    val testaFuncao = Endereco().let {
        println("Endereço - $it")
    }

    "teste".let(::recebeString)
    1.let {
        println("1 - $it")
    }

    teste(1, {})

}

fun recebeString(valor: String) {
    println("Recebe String - $valor")
}

//higher order function
fun teste(teste: Int, bloco: () -> Unit): () -> Unit {
    return {
    }
}