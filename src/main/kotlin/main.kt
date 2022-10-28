fun main() {
    println("Bem vindo ao Bytebank")

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

    println(contaTwo.titular)
    println(contaTwo.numero)
    println(contaTwo.saldo)

//    testaLacos()
//    testaCondicoes(saldo)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos() {
    for (i in 5 downTo 1) {
        if (i == 4) {
//            break
            continue
        }

        val titular: String = "Dionatan $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println("----------------------------")
    }

    var i = 0
    while (i < 5) {
        val titular: String = "Dionatan $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println("----------------------------")
        i++
    }

}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}