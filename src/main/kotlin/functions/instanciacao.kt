import domain.Conta

fun instanciacao() {
    val contaOne = Conta()
    contaOne.titular = "Dionatan"
    contaOne.numero = 1000
    contaOne.setSaldo(200.0)

    val contaTwo = Conta()
    contaTwo.titular = "Leão"
    contaTwo.numero = 1001
    contaTwo.setSaldo(300.0)

    println(contaOne.titular)
    println(contaOne.numero)
    println(contaOne.getSaldo())

    println("---------------------------------")

    println(contaTwo.titular)
    println(contaTwo.numero)
    println(contaTwo.getSaldo())

    println("---------------------------------")

    println("depositando na conta One")
    contaOne.deposita(50.0)
    println(contaOne.getSaldo())

    println()

    println("depositando na conta Two")
    contaTwo.deposita(70.0)
    println(contaTwo.getSaldo())

    println()

    println("sacando na conta One")
    contaOne.saca(250.0)
    println(contaOne.getSaldo())

    println()

    println("sacando na conta Two")
    contaTwo.saca(100.0)
    println(contaTwo.getSaldo())

    println()

    println("saque em excesso One")
    contaOne.saca(100.0)
    println(contaOne.getSaldo())

    println("saque em excesso Two")
    contaOne.saca(500.0)
    println(contaTwo.getSaldo())

    println()

    println("transferencia da conta Two para a conta One")
    if (contaTwo.transfere(100.0, contaOne)) {
        println("transferência sucedida")
    } else {
        println("falha na transferência")
    }

    println()
    println(contaOne.getSaldo())
    println(contaTwo.getSaldo())
}