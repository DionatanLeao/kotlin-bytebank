package functions

import domain.Analista
import domain.Diretor
import domain.Gerente
import service.CalculadoraBonificacao

fun testaFuncionarios() {
    val funcionarioUm = Analista(
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

    if (funcionarioTres.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    println()

    val funcionarioQuatro: Analista = Analista(
        "funcionario quatro",
        "444.444.444-44",
        3000.0
    )

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(funcionarioUm)
    calculadora.registra(funcionarioDois)
    calculadora.registra(funcionarioTres)
    calculadora.registra(funcionarioQuatro)

    println("total de bonificação: ${calculadora.total}")
}