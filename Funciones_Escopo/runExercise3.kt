/*Use run para modificar as propriedades de um objeto Aluno e retornar uma string dizendo se ele passou ou não.*/

data class Aluno(val nome: String, var nota: Int)

fun main() {
    val aluno = Aluno("Cristian", 7)

    val resultado = aluno.run {
        nota = 10
    

    if(nota >= 7) {
        "Aluno Passou"
    } else {
        "Aluno não passou"
    }
}   

    println("O Aluno $(aluno.nome) tem a nota ${aluno.nota}, e o $resultado")
}