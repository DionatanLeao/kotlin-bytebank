package domain

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open fun bonificacao(): Double {
        println("bonificação funcionario")
        return salario * 0.1
    }
}