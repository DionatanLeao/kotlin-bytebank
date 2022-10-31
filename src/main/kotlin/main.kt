import domain.Funcionario
import domain.Gerente

fun main() {
    println("------------------------------------------------------------------")
    println("------------------- Bem vindo ao Bytebank ------------------------")
    println("------------------------------------------------------------------")

    val funcionarioUm = Funcionario(
        "funcionario um",
        "111.111.111-11",
        1000.0
    )

    println("nome: ${funcionarioUm.nome}")
    println("cpf: ${funcionarioUm.cpf}")
    println("salario: ${funcionarioUm.salario}")
    println("bonificação: ${funcionarioUm.bonificacao()}")
    println()

    val funcionarioDois = Gerente(
        "funcionario dois",
        "222.222.22-22",
        2000.0,
        1234
    )

    println("nome: ${funcionarioDois.nome}")
    println("cpf: ${funcionarioDois.cpf}")
    println("salario: ${funcionarioDois.salario}")
    println("bonificação: ${funcionarioDois.bonificacao()}")

    if (funcionarioDois.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

}



