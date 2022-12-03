package collections

fun main() {
    map()
}

private fun map() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("Pedido $it")
    }
    pedidos.forEach {
        println("número do pedido: ${it.key}")
        println("valor do pedido: ${it.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos.put(1, 100.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)
    pedidos.remove(6)
    println(pedidos)

//    val valorPedido = pedidos.get(0)
//    val valorPedido = pedidos.getValue(5)
    val mensagem = pedidos.getOrElse(0) {
        0.0
    }

    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))
    println(pedidos.keys)

    for (numeroPedidos in pedidos.keys) {
        println("Pedido: $numeroPedidos")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosPares)

//    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)
    println(pedidos - listOf(5,6))
    println(pedidos)

//    pedidos.putAll(setOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)

}