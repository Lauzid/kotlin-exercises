/**
 * Exercicio 4:
 * ------------
 * Escrever um algoritmo que leia uma quantidade desconhecida de números
 * e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
 * A entrada de dados deve terminar quando for lido um número negativo.
 */

fun main () {

    var intervalo1 = 0
    var intervalo2 = 0
    var intervalo3 = 0
    var intervalo4 = 0

    do {
        var n: Int? = -1
        n = readlnOrNull()?.toIntOrNull()
        n?.let {
            when (n) {
                in 0..25 -> intervalo1++
                in 26..50 -> intervalo2++
                in 51..75 -> intervalo3++
                in 76..100 -> intervalo4++
                else -> Unit
            }
        } ?: run {
            n = -1
        }

    } while (n!! >= 0)
    println("A quantidade de valores no intervalo 1 é de $intervalo1")
    println("A quantidade de valores no intervalo 2 é de $intervalo2")
    println("A quantidade de valores no intervalo 3 é de $intervalo3")
    println("A quantidade de valores no intervalo 4 é de $intervalo4")

}
