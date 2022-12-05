package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("------------------------------------------------------------------")
            println("------------------- Bem vindo ao Bytebank ------------------------")
            println("------------------------------------------------------------------")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }
}