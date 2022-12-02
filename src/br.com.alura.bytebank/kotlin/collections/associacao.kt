package collections

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.00),
        Pedido(2, 60.00),
        Pedido(3, 30.00),
        Pedido(4, 70.00),
        Pedido(5, 40.00)
    )

    println(pedidos)

//    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
//        pedido.numero to pedido
//    }
    val pedidosMapeados = pedidos.associateBy { pedido: Pedido ->
        pedido.numero
    }

    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

//    val mapa = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)
    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Nome1",
        "Nome2",
        "Nome3",
        "Nome4",
        "Nome5",
        "Nome6",
        "Nome7",
        "Nome8"
    )

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])

}

data class Pedido(
    val numero: Int,
    val valor: Double
)