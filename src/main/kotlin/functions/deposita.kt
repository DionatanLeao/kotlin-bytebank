package functions

import domain.Conta

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}