fun main () {
    var soma = 0
    for (number in 1..500){
        if (number %2 != 0 && number %3 == 0) {
            soma += number
        }
    }
    println(soma)
}