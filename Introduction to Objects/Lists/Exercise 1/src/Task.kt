// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var max = 0
  for (i in list) {
    if (max < i)
      max = i
  }
  return max
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}