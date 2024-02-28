package POO.Ex1

fun main() {
    val minhaConta = ContaCorrente(1234, 1000.0)

    minhaConta.imprimir()

    minhaConta.creditar(120.0)

    minhaConta.debitar(2000.0)

    minhaConta.debitar(200.0)

    val minhaConta2 = ContaCorrente(1235, 500.0)
    minhaConta2.creditar(20.0)

    minhaConta.imprimir()

}
