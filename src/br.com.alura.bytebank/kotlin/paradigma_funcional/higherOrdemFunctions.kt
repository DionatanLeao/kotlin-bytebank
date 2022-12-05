package paradigma_funcional

import modelo.Autenticavel
import modelo.SistemaInterno

fun main() {
    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

}

private fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a+b)
    println("Soma finalizada")
}