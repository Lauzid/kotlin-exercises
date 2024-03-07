package poo.Ex2

fun main () {
    // Criando personagens. Primeira seção dedicada ao exercito 1, segunda ao exercito 2.
    val p1 = Personagem("White Rayla", TipoDePersnagem.ARQUEIRO)
    val p2 = Personagem("Jacques de Aldersberg", TipoDePersnagem.FEITICEIRO)
    val p3 = Personagem("Sigfried", TipoDePersnagem.GUERREIRO)

    val p4 = Personagem("Yaevinn", TipoDePersnagem.GUERREIRO)
    val p5 = Personagem("Iorveth", TipoDePersnagem.ARQUEIRO)
    val p6 = Personagem("Filavandrel", TipoDePersnagem.FEITICEIRO)

    // Criando exércitos, adicionando tropas e mostrando tropas.
    val ex1 = Exercito("Order of the White Rose")
    ex1.addTropa(p1)
    ex1.addTropa(p2)
    ex1.addTropa(p3)
    ex1.mostrarTropas()

    val ex2 = Exercito("Scoia'tael")
    ex2.addTropa(p4)
    ex2.addTropa(p5)
    ex2.addTropa(p6)
    ex2.mostrarTropas()

    // Validando se o personagem já foi contratado.
    p1.isContratado()
    ex1.addTropa(p1)
    p1.isContratado()

    p2.isContratado()
    ex1.removeTropa(p2)
    p2.isContratado()
    ex1.removeTropa(p2)

    //

    ex1.mostrarTropas()
    ex2.mostrarTropas()

    // Batalhar

    // Empate
    ex1.addTropa(p2)
    ex1.batalhar(ex2)

    // Vitória
    ex1.removeTropa(p2)
    ex1.batalhar(ex2)
}
