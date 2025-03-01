fun insertionSort(arr: IntArray) {
    // Empezamos desde el segundo elemento (índice 1) ya que el primero se considera ordenado
    for (j in 1 until arr.size) {
        val key = arr[j]  // Elemento actual que vamos a insertar en la sublista ordenada
        var i = j - 1   // Índice del último elemento en la sublista ordenada

        // Mientras queden elementos en la sublista y el elemento actual es mayor que la clave,
        // se desplaza el elemento hacia la derecha para dejar espacio para 'key'
        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i]  // Se mueve el elemento actual una posición a la derecha
            i--  // Se retrocede para comparar con el siguiente elemento en la sublista ordenada
        }
        // Una vez encontrados todos los elementos mayores, se inserta la clave en su posición correcta
        arr[i + 1] = key
    }
}

fun main() {
    val array = intArrayOf(5, 2, 4, 6, 1, 3)
    println("Arreglo original: ${array.joinToString(", ")}")
    insertionSort(array)
    println("Arreglo ordenado: ${array.joinToString(", ")}")
}
