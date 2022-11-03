package functions

import entities.Cliente
import entities.Diretor
import entities.Gerente
import services.SistemaInterno

fun autenticacao() {
    val gerente = Gerente(
        "Gerente",
        "111.111.111-11",
        1000.0,
        1000
    )

    val diretor = Diretor(
        "Diretor",
        "222.222.222-22",
        1000.0,
        1000,
        200.0
    )

    val cliente = Cliente(
        "Cliente",
        "333.333.333-33",
        3000
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente, 3000)
}