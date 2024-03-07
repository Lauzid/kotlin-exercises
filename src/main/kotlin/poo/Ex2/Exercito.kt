package poo.Ex2

class Exercito (val nome: String) {
    val tropas: MutableList<Personagem> = mutableListOf()
    fun addTropa (tropa: Personagem) {
        if (tropa.contratado == false) {
            tropas.add(tropa)
            tropa.contratado = true
            println("${tropa.nome} foi adicionado(a) ao exército $nome")
        } else {
            println("${tropa.nome} já foi contratado(a).")
        }
    }
    fun removeTropa (tropa: Personagem) {
        // So pode ser removido se o personagem estiver no exército. Criar condicional para validar isso.
        if (tropas.contains(tropa)){
            tropas.remove(tropa)
            tropa.contratado = false
            println("${tropa.nome} foi removido do exército $nome.")
        } else {
            println("${tropa.nome} não está presente no exército $nome.")
        }
    }
    fun mostrarTropas () {
        println("Tropas do exército $nome: ")
        for (tropa in tropas) {
            println("- ${tropa.nome} ")
        }
        println("")
    }
    fun batalhar (inimigo: Exercito) {
//        val desafianteForca = tropas.sumBy { it.getVida() }
//        val inimigoForca = inimigo.tropas.sumBy { it.getVida() }
        var desafianteForca = 0
        for (tropa in tropas) {
            desafianteForca += tropa.getVida()
        }
        var inimigoForca = 0
        for (tropaInimiga in inimigo.tropas) {
            inimigoForca += tropaInimiga.getVida()
        }
        if (desafianteForca > inimigoForca) {
            println("$nome ganhou a batalha!")
        } else if (desafianteForca < inimigoForca) {
            println("${inimigo.nome} ganhou a batalha!")
        } else {
            println("Os exércitos empataram.")
        }
        println("Força desafiante: $desafianteForca. Força inimigo: $inimigoForca")
    }
}