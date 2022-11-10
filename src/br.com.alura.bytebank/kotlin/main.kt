import modelo.*
import teste.autenticacao
import teste.contasDiferentes

fun main() {

    val clientObjExpressions = object : Autenticavel {
        val nome: String = "Nome"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(clientObjExpressions, clientObjExpressions.senha)

    println("Nome do cliente: ${clientObjExpressions.nome}")

    autenticacao()
    contasDiferentes()

    val cliente = Cliente(nome = "Cliente", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)
    val contaCorrente = ContaCorrente(titular = cliente, numero = 1001)

    println("Total de contas: ${Conta.Contador.total}")

}



