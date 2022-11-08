import modelo.ContaCorrente
import modelo.ContaPoupanca

fun comportamentosConta() {
    val contaUm = ContaCorrente("Dionatan", 1000)
    contaUm.deposita(200.0)

    val contaDois = ContaPoupanca("Leão", 1001)
    contaDois.deposita(300.0)

    println(contaUm.titular)
    println(contaUm.numero)
    println(contaUm.saldo)

    println("---------------------------------")

    println(contaDois.titular)
    println(contaDois.numero)
    println(contaDois.saldo)

    println("---------------------------------")

    println("depositando na conta Um")
    contaUm.deposita(50.0)
    println(contaUm.saldo)

    println()

    println("depositando na conta Dois")
    contaDois.deposita(70.0)
    println(contaDois.saldo)

    println()

    println("sacando na conta Um")
    contaUm.saca(250.0)
    println(contaUm.saldo)

    println()

    println("sacando na conta Dois")
    contaDois.saca(100.0)
    println(contaDois.saldo)

    println()

    println("saque em excesso Um")
    contaUm.saca(100.0)
    println(contaUm.saldo)

    println("saque em excesso Dois")
    contaUm.saca(500.0)
    println(contaDois.saldo)

    println()

    println("transferencia da conta Dois para a conta Um")
    if (contaDois.transfere(valor = 300.0, destino = contaUm)) {
        println("transferência sucedida")
    } else {
        println("falha na transferência")
    }

    println()
    println(contaUm.saldo)
    println(contaDois.saldo)
}