package modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Any) {
        val funcionarioNovo: Funcionario = funcionario as Funcionario
        this.total += funcionario.bonificacao
    }
}