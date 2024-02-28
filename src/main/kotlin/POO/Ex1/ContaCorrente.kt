package POO.Ex1

class ContaCorrente (private val numero: Int, private var saldo: Double) {

    companion object {
        private var contas = 0
    }

    init {
        contas++
    }

    fun getNumero(): Int {
        return numero
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun debitar (debito: Double) {
        if (saldo < debito) {
            println("Você não tem saldo suficiente para debitar o valor: $debito")
        } else {
        saldo = getSaldo() - debito
            println("Saldo debitado! Saldo atual: ${getSaldo()}")
        }
    }

    fun creditar (credito: Double) {
        saldo = getSaldo() + credito
        println("Saldo creditado! Saldo atual: ${getSaldo()}")
    }

    fun imprimir () {
        println("O número da conta é: ${getNumero()} e o seu saldo é de: ${getSaldo()}.")
        println("Quantidade de contas criadas: $contas")
    }
}