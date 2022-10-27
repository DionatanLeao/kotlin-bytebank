fun main() {
    println("Bem vindo ao Bytebank")
    println()

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

//    testaCondicoes(saldo)
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