package poo.Ex2

class Personagem(val nome:String, val tipoDePersnagem: TipoDePersnagem) {
    var vida: Int = 1000
        private set

    init {
        when (tipoDePersnagem) {
            TipoDePersnagem.ARQUEIRO -> vida += 50
            TipoDePersnagem.FEITICEIRO -> vida += 150
            TipoDePersnagem.GUERREIRO -> vida += 250
        }
        println("Personagem criado com nome $nome, classe $tipoDePersnagem e ${vida}HP")
    }
}