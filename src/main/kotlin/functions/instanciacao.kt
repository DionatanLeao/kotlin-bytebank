import domain.Conta

fun instanciacao() {
    val contaOne = Conta()
    contaOne.titular = "Dionatan"
    contaOne.numero = 1000
    contaOne.saldo = 200.0

    val contaTwo = Conta()
    contaTwo.titular = "Leão"
    contaTwo.numero = 1001
    contaTwo.saldo = 300.0

    println(contaOne.titular)
    println(contaOne.numero)
    println(contaOne.saldo)

    println("---------------------------------")

    println(contaTwo.titular)
    println(contaTwo.numero)
    println(contaTwo.saldo)

    println()

    println("depositando na conta One")
    contaOne.deposita(50.0)
    println(contaOne.saldo)

    println()

    println("depositando na conta Two")
    contaTwo.deposita(70.0)
    println(contaTwo.saldo)

    println()

    println("sacando na conta One")
    contaOne.saca(250.0)
    println(contaOne.saldo)

    println()

    println("sacando na conta Two")
    contaTwo.saca(100.0)
    println(contaTwo.saldo)

    println()

    println("saque em excesso One")
    contaOne.saca(100.0)
    println(contaOne.saldo)

    println("saque em excesso Two")
    contaOne.saca(500.0)
    println(contaTwo.saldo)
}