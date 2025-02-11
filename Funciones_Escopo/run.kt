/* run é uma função de escopo em Kotlin que executa um bloco de código dentro do contexto de um objeto e retorna um valor.*/

data class Carro(val: modelo: String, val portas: Int)

fun main() {
    val meuCarro = Carro("Ferrari", 2)

    val mensagem =  meuCarro.run {
        if (portas <= 2) "Carros esportivos são incriveis!" else "Carro familiar"
    }

    println(mensagem)
}

/*permite acessar diretamente portas  e retornar a String correspondente*/