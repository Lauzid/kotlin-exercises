fun main () {
    var maior = Double.MIN_VALUE
    var menor = Double.MAX_VALUE
    for (inputs in 1..5) {
        val altura = readlnOrNull()?.toDoubleOrNull()
        altura?.let {
            if (maior < it) {
                maior = it
            }
            if (menor > it) {
                menor = it
            }
        }
    }
    println("O maior integrante do grupo tem altura de $maior")
    println("O menor integrante do grupo tem altura de $menor")
}
