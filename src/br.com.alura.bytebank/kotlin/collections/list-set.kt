package collections

fun main() {
//    list()
//    set()
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("Pedido $it")
    }

    pedidos.forEach {
        println("número do pedido: ${it.key}")
        println("valor do pedido: ${it.value}")
    }
}

private fun set() {
    val assistiramCursoAndroid = mutableSetOf("Nome1", "Nome2", "Nome3", "Nome4")
    val assistiramCursoKotlin = mutableSetOf("Nome1", "Nome5", "Nome4")
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Nome6")
    println(assistiramAmbos)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid.subtract(assistiramCursoKotlin))
    println(assistiramCursoAndroid.intersect(assistiramCursoKotlin))
}

private fun list() {
    val assistiramCursoAndroid = listOf("Nome1", "Nome2", "Nome3", "Nome4")
    val assistiramCursoKotlin = listOf("Nome1", "Nome5", "Nome4")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
    println(assistiramAmbos.distinct())
}