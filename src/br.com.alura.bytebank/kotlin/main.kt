import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca
import modelo.totalContas
import teste.autenticacao
import teste.contasDiferentes

fun main() {
    autenticacao()
    contasDiferentes()

    val cliente = Cliente(nome = "Cliente", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)
    val contaCorrente = ContaCorrente(titular = cliente, numero = 1001)

    println("Total de contas: $totalContas")

}



