/* Modifica el algoritmo de insertion sort para que ordene un arreglo de números enteros en orden descendente  */

fun insertionSortDes(arr : IntArray) {
    for( j in 1 until arr.size) {
        val key =  arr[j]
        var i = j - 1
        
        while ( i >= 0 && arr[i] < key) {
            arr[i + 1] = arr[i]
            i--
        }        
        arr[i + 1] = key
    }
}

fun main() {
    val array = intArrayOf(1, 4, 2, 5 , 7 ,8)
    println("Arreglo original: ${array.joinToString(", ")}")
    insertionSortDes(array)
    println("Arreglo ordenado em orde descendente: ${array.joinToString(", ")}")
}