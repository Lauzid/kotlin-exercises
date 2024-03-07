package poo.Ex2

class Personagem(val nome:String, val tipoDePersnagem: TipoDePersnagem) {
    private var vida: Int = 1000
    var contratado: Boolean = false
    init {
        when (tipoDePersnagem) {
            TipoDePersnagem.ARQUEIRO -> vida += 50
            TipoDePersnagem.FEITICEIRO -> vida += 150
            TipoDePersnagem.GUERREIRO -> vida += 250
        }
        println("Personagem criado com nome $nome, classe $tipoDePersnagem e ${vida}HP. Contratado? $contratado")
    }
    fun isContratado () {
        println("$nome está contratado? $contratado")
    }
    fun getVida ():Int {
        return vida
    }
}