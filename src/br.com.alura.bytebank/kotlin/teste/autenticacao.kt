package teste

import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

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
        nome = "Cliente",
        cpf = "333.333.333-33",
        senha = 3000
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente, 3000)
}