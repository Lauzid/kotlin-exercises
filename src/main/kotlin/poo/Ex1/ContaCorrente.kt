package poo.Ex1

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

    fun transferencia (tipo: String, favorecido: ContaCorrente, montante: Double) {
        when (tipo) {
            "PIX" -> {
                if (this.saldo >= montante) {
                    this.saldo -= montante
                    favorecido.saldo += montante
                    println("Transferência $tipo da conta ${this.numero} de valor ${montante}R$ recebida com sucesso na conta ${favorecido.numero}.")
                } else {
                    println("Saldo insuficiente na conta ${this.numero} para receber a transferência $tipo.")
                }
            }
            "TED" -> {
                val taxa = 15
                if (this.saldo >= montante) {
                    this.saldo -= montante + taxa
                    favorecido.saldo += montante
                    println("Transferência $tipo da conta ${this.numero} de valor ${montante}R$ recebida com sucesso na conta ${favorecido.numero}. Taxa $tipo subtraída: ${taxa}R$")
                } else {
                    println("Saldo insuficiente na conta ${this.numero} para receber a transferência $tipo.")
                }
            }
            "DOC" -> {
                val taxa = 18
                if (this.saldo >= montante) {
                    this.saldo -= montante + taxa
                    favorecido.saldo += montante
                    println("Transferência $tipo da conta ${this.numero} de valor ${montante}R$ recebida com sucesso na conta ${favorecido.numero}. Taxa $tipo subtraída: ${taxa}R$")
                } else {
                    println("Saldo insuficiente na conta ${this.numero} para receber a transferência $tipo.")
                }
            }
        }
    }
}