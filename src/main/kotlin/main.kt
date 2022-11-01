import domain.Diretor
import domain.Funcionario
import domain.Gerente
import service.CalculadoraBonificacao

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
        "222.222.222-22",
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

    println()

    val funcionarioTres = Diretor(
        "funcionario tres",
        "333.333.333-33",
        4000.0,
        4000,
        200.0
    )

    println("nome: ${funcionarioTres.nome}")
    println("cpf: ${funcionarioTres.cpf}")
    println("salario: ${funcionarioTres.salario}")
    println("plr: ${funcionarioTres.plr}")
    println("bonificação: ${funcionarioTres.bonificacao()}")
    println()

    if (funcionarioTres.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(funcionarioUm)
    calculadora.registra(funcionarioDois)
    calculadora.registra(funcionarioTres)

    println("total de bonificação: ${calculadora.total}")

}



