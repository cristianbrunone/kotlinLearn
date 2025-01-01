fun main() {
val edad = 25
when {
    edad in 0..12 -> println("Niño")
    edad in 13..17 -> println("Adolescente")
    edad in 18..30 -> println("Adulto joven")
    edad in 31..59 -> println("Adulto")
    edad >= 60 -> println("Anciano")
    else -> println("Edad inválida")
}

}
