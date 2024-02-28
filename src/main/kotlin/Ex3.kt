/**
 * Exercicio 3:
 * -----------
 * Desenvolver um algoritmo que leia um número não determinado de valores
 * e calcule e escreva a média aritmética dos valores lidos, a quantidade
 * de valores positivos, a quantidade de valores negativos e o percentual
 * de valores negativos e positivos.
 */

fun main () {
    var soma = 0.0
    var qtdP = 0.0
    var qtdN = 0.0
    var exit: String? = ""
    println("Se quiser parar o programa, aperte enter sem nenhum número")
    while (exit != null) {
        println("Digite o número: ")
        val n = readlnOrNull()?.toDoubleOrNull()
        n?.let {
            soma += n
            if (n >= 0) {
                qtdP++
            } else {
                qtdN++
            }

        } ?: run {
            exit = null
        }
    }
    println("${soma / (qtdP + qtdN)}")
    println("${qtdP / (qtdP + qtdN)}")
    println("${qtdN / (qtdP + qtdN)}")
    println(qtdP)
    println(qtdN)
}