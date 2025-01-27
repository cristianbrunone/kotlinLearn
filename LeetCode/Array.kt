// Definición de la clase DVD
class DVD(val name: String, val releaseYear: Int, val director: String) {
    // Método toString para mostrar el DVD en formato legible
    override fun toString(): String {
        return "$name, directed by $director, released in $releaseYear"
    }
}

fun main() {
    // Crear un array para guardar DVDs
    val dvdCollection = arrayOfNulls<DVD>(15)

    // Agregar DVDs al arreglo
    dvdCollection[0] = DVD("Inception", 2010, "Christopher Nolan")
    dvdCollection[1] = DVD("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski")

    val avengersDVD  = DVD("the Avengers", 2012, "Joss Whedon")
    dvdCollection[7] = avengersDVD
    
    
    
    // Imprimir información de los DVDs
    for (dvd in dvdCollection) {
        if (dvd != null) {
            println(dvd)
        }
    }

    println(dvdCollection[0])
}



/* usamos arrayOfNulls<T>(size) para crear un array que puede contener elementos nulos(null)
de un tipo especifico*/

/*Array: Estructura de datos que almacena multiples elementos en una posición indexada*/

/* boilerplate: (codigo repetitivo)*/

/* class plantilla para crear objetos (instancias) con atributos y metodos*/

/* Override: indica que  estamos sobreescribiendo  un método de la clase base */

/* toString: metodo que convierte un objeto en su representacion  de texto*/