import domain.Conta
import functions.deposita

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
    deposita(contaOne, 50.0)
    println(contaOne.saldo)
    println()
    println("depositando na conta Two")
    deposita(contaTwo, 70.0)
    println(contaTwo.saldo)
}