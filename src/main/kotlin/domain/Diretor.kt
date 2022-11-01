package domain

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        println("bonificação diretor")
        return salario * 0.1 + salario + plr
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }
}