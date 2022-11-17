package colecoes

fun ranges() {
    val serie: IntRange = 1.rangeTo(10) // 0

    serie.forEach { s ->
        print("$s ")
    }

    println()

    val numerosPares = 0.until(100) step 2
    numerosPares.forEach { numero ->
        print("$numero ")
    }

    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { numeroReverso ->
        print("$numeroReverso ")
    }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 5001.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        print("Não está dentro do intervalo")
    }

    println()

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}