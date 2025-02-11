/*Crie uma lista de números e use run para calcular e imprimir a soma dos números.*/

val listNum = listOf(2,2,2)

fun main() {
    val somaNum = listNum.run {
        var soma = 0
        for (numero in this) { /*this é a lista */
            soma += numero
        }
        soma
    }

    println("A soma dos números é: $somaNum")
}

/*Otra forma de hacerlo es con la funcion sum() de kotlin que por detras percorre los elementos de la lista y los suma*/

val listNum = listOf(2,2,2)

fun main() {
    val somaNum = listNum.run {
        sum()
    }

    println("A soma dos números é: $somaNum")
}
