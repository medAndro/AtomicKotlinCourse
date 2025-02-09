// Varargs/Task3.kt
package variableArgumentListsExercise3
import atomictest.eq

fun listOfChunks(size: Int, vararg elements: String): List<List<String>> {
//  val listLength = if (elements.size % size == 0) (elements.size/size) else (elements.size/size)+1
//  val answer = mutableListOf<List<String>>()
//  var counter = 0
//  for (i in 0 until listLength) {
//    val innerList = mutableListOf<String>()
//    for (j in 0 until size) {
//      innerList.add(elements[counter])
//      counter++
//      if (counter == elements.size) break
//    }
//    answer.add(innerList)
//  }
//  return answer
  return elements.toList().chunked(size)
}

fun main() {
  val chunks = listOfChunks(3, "a", "b", "c", "d", "e", "f", "g")
  chunks eq listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("g"))
}