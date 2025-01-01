fun main() {
    val edad = 15

    val categoria = when (edad) {
        in 0..12 -> "Niño"
        in 13..17 -> "Adolescente"
        in 18..30 -> "Adulto"
        in 31..59 -> "Anciano"
        else -> "Edad inválida"
    }
    println("Categoría: $categoria")
}
