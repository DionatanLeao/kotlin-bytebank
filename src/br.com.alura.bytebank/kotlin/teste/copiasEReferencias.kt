import modelo.Cliente
import modelo.ContaCorrente

fun copiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "111.111.111-11", senha = 12345)
    val maria = Cliente(nome = "Maria", cpf = "222.222.222-22", senha = 54321)

    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = contaJoao

    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}