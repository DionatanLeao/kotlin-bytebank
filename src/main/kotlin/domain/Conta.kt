package domain

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(valor: Double) {
        if (saldo > 0) {
            saldo = saldo
        }
    }

    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}