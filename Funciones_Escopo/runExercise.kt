/*Crie um programa que usa run para calcular a área de um retângulo*/

data class  Retangulo(var largura: Int, var altura: Int)

fun main() {
    val retangulo  = Retangulo(5,10)

    val area = retangulo.run {
        largura * altura
    }

    println("Area do retângulo: $area")
}
