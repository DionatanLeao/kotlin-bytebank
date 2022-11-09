package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("------------------------------------------------------------------")
            println("------------------- Bem vindo ao Bytebank ------------------------")
            println("------------------------------------------------------------------")
        } else {
            println("Falha na autenticação")
        }
    }
}