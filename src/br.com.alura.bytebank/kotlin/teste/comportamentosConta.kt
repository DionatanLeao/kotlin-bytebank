import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException
import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun comportamentosConta() {

    val clienteUm = Cliente(nome = "Dionatan", cpf = "111.111.111-11", senha = 12345)
    val clienteDois = Cliente(nome = "Leão", cpf = "222.222.222-22", senha = 54321)

    val contaUm = ContaCorrente(clienteUm, 1000)
    contaUm.deposita(200.0)

    val contaDois = ContaPoupanca(clienteDois, 1001)
    contaDois.deposita(300.0)

    println(contaUm.titular)
    println(contaUm.numero)
    println(contaUm.saldo)

    println("---------------------------------")

    println(contaDois.titular)
    println(contaDois.numero)
    println(contaDois.saldo)

    println("---------------------------------")

    println("depositando na conta Um")
    contaUm.deposita(50.0)
    println(contaUm.saldo)

    println()

    println("depositando na conta Dois")
    contaDois.deposita(70.0)
    println(contaDois.saldo)

    println()

    println("sacando na conta Um")
    contaUm.saca(250.0)
    println(contaUm.saldo)

    println()

    println("sacando na conta Dois")
    contaDois.saca(100.0)
    println(contaDois.saldo)

    println()

    println("saque em excesso Um")
    contaUm.saca(100.0)
    println(contaUm.saldo)

    println("saque em excesso Dois")
    contaUm.saca(500.0)
    println(contaDois.saldo)

    println()

    println("transferencia da conta Dois para a conta Um")

    try {
        contaDois.transfere(valor = 200.0, destino = contaUm, 54321)
        println("transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("falha na transferência")
        println("saldo insuficiente")
        e.printStackTrace()
    } catch (ex: FalhaAutenticacaoException) {
        println("falha na transferência")
        println("falha na atenticação")
        ex.printStackTrace()
    }


    println()
    println(contaUm.saldo)
    println(contaDois.saldo)
}