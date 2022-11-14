package exception

class FalhaAutenticacaoException(
    mensagem: String = "falha na autenticação"
) : Exception(mensagem) {
}