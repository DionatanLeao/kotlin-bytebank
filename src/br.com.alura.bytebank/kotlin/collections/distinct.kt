package collections

fun main() {
//    list()
    val assistiramCursoAndroid = mutableSetOf("Nome1", "Nome2", "Nome3", "Nome4")
    val assistiramCursoKotlin = mutableSetOf("Nome1", "Nome5", "Nome4")
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Nome6")
    println(assistiramAmbos)

}

private fun list() {
    val assistiramCursoAndroid = listOf("Nome1", "Nome2", "Nome3", "Nome4")
    val assistiramCursoKotlin = listOf("Nome1", "Nome5", "Nome4")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
    println(assistiramAmbos.distinct())
}