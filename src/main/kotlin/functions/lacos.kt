fun lacos() {
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