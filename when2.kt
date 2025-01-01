fun main() {

val rol = "admin"
val permiso = when (rol) {
    "admin" -> "Acceso total"
    "moderador" -> "Moderacion de contenido"
    "usuario" -> "Acceso limitado"
    else -> "Rol desconocido"

}
    println("Permiso $permiso")


}


