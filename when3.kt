fun main() {
    val num1 = 3
    val num2 = 5
    val operador = "*"
    
    val resultado  = when (operador) {
        "*" -> num1 * num2
        "+" -> num1 + num2
        "-" -> num1 - num2
        "/" -> if(num2 != 0) num1 / num2 else "Division por cero"
        else -> "Operacion invalida" 
    }
    
    println("Resultado: $resultado")
    
    
}