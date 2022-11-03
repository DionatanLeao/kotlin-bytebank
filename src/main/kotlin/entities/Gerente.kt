package entities

import interfaces.Autenticavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario
        }
}