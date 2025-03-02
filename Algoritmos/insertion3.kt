/*Aplicar insertion sort para ordenar un arreglo de String en orden alfabético. */

fun insertionSortString(arr : Array<String>) {
  for(j in 1 until arr.size) {
      val key = arr[j]
      var i = j - 1
      
      //usamos compareTo para comparar cadenas alfabeticamente
      
      while( i >= 0 && arr[i].compareTo(key) > 0) {
          arr[i + 1] = arr[i]
          i--
      }
      arr[i + 1] = key
  }
    
}    
    
fun main() {
    val palabras = arrayOf("naranaja", "manzana", "banana", "kiwi", "uva")
    println("Arreglo original: ${palabras.joinToString(",")}")
    insertionSortString(palabras)
    println("Arreglo ordenado: ${palabras.joinToString(", ")}")
    
}