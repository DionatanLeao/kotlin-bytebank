package collections

fun main() {
    set()
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