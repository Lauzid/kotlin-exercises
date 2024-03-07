package poo.Ex2

class Exercito (val nome: String) {
    val tropas: MutableList<Personagem> = mutableListOf()
    fun addTropa (tropa: Personagem) {
        if (tropa.contratado == false) {
            tropas.add(tropa)
            tropa.contratado = true
        } else {
            println("${tropa.nome} já foi contratado(a).")
        }
    }
    fun removeTropa (tropa: Personagem) {
        // So pode ser removido se o personagem estiver no exército. Criar condicional para validar isso.
        if (tropa.contratado == true) {
            tropas.remove(tropa)
            tropa.contratado = false
        } else {
            println("${tropa.nome} não está contratado(a).")
        }

    }
    fun mostrarTropas () {
        println("Tropas do exército $nome: ")
        for (tropa in tropas) {
            println("- ${tropa.nome} ")
        }
        println("")
    }
    fun batalhar () {
        // Lógica para confrontar exércitos.
    }
}