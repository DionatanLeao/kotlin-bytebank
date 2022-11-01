package domain

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        println("bonificação analista")
        return super.bonificacao()  + salario + 0.1
    }

}