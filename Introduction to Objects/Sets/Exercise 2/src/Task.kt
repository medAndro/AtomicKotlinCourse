// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  val oneToTwentyfive = mutableSetOf<Int>()
  var count = 0
  while (oneToTwentyfive.size != 25) {
    oneToTwentyfive += Random.nextInt(25) + 1
    count++
  }
  return count
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}