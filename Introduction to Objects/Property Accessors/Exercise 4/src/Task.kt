// PropertyAccessors/Task4.kt
package propertyAccessorsExercise4
import atomictest.eq

class AccessCounter {
  private var counter = 0

  val accesses: Int
    get() = ++counter
}

fun main() {
  val counter = AccessCounter()
  counter.accesses eq 1
  counter.accesses eq 2
  counter.accesses eq 3

  val counter2 = AccessCounter()
  repeat(10) {
    counter2.accesses
  }
  counter2.accesses eq 11
}