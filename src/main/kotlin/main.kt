import domain.Funcionario

fun main() {
    println("---------------------------------")
    println("----- Bem vindo ao Bytebank -----")
    println("---------------------------------")

    val funcionarioUm = Funcionario(
        "funcionario um",
        "111.111.111-11",
        1000.0
    )

    println("nome ${funcionarioUm.nome}")
    println("cpf ${funcionarioUm.cpf}")
    println("salario ${funcionarioUm.salario}")
    println("bonificação ${funcionarioUm.bonificacao()}")
}



