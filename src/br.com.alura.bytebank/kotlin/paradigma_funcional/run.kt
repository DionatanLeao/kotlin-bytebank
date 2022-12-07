package paradigma_funcional

import modelo.Cliente
import modelo.ContaPoupanca

fun main() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Nome", cpf = "111.111.111-11", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")
    }

    run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }.let { rendimentoAnual ->
        println("simulação rendimento anual $rendimentoAnual")
    }

}