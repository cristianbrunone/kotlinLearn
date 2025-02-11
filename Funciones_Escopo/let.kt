data class Carro(val modelo: String, portas: Int)

fun main() {
    val carro = Carro('BMW, 4)

    val mensagemLeft = carro.let {
        if (it.portas <= 2) "Carro esportivo" else "Carro normal"
    }

    val mensagemRun = carro.run {
        if (portas <= 2) "Carro esportivo else "Carro normal"
    }
}


/*let usa it como referencia ao objeto e run usa this e parece mais natural quando voce quer modificar ou acessar propriedades diretamente */

