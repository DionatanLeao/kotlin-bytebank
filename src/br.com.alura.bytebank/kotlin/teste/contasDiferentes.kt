package teste

import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun contasDiferentes() {

    val titularContaCorrente = Cliente("conta corrente", "111.111.111-11", 12345)
    val titularContaPoupanca = Cliente("conta poupança", "222.222.222-22", 54321)

    val contaCorrente = ContaCorrente(
        titular = titularContaCorrente,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = titularContaPoupanca,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após conta corrente: ${contaCorrente.saldo}")
    println("saldo após conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo conta poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo conta corrente após receber transferência: ${contaCorrente.saldo}")
}