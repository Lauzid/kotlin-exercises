package poo.Ex1

fun main() {
    val Conta1 = ContaCorrente(333, 1000.0)
    val Conta2 = ContaCorrente(444, 500.0)
    println("saldo da conta 1: ${Conta1.getSaldo()}")
    println("saldo da conta 2: ${Conta2.getSaldo()}")

    Conta1.transferencia("DOC", Conta2, 100.0)

    println("saldo da conta 1: ${Conta1.getSaldo()}")
    println("saldo da conta 2: ${Conta2.getSaldo()}")

}
