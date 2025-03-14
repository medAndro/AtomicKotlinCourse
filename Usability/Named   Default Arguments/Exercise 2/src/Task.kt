// NamedAndDefaultArgs/Task2.kt
package namedAndDefaultArgumentsExercise2
import atomictest.eq

class SimpleTime(val hours:Int=0, val minutes:Int=0, val seconds:Int=0,val nanoseconds:Int=0) {
  fun toSecondOfDay(): Int =
    (hours * 60 * 60)+(minutes * 60)+(seconds)

  fun toNanoOfDay(): Long {
    val oneSec = 1000000000L
    return toSecondOfDay() * oneSec + nanoseconds.toLong()
  }
}

fun main() {

    val noon = SimpleTime(12)
    noon.toSecondOfDay() eq 12 * 60 * 60

    val nanosecond = SimpleTime(nanoseconds = 1)
    nanosecond.toNanoOfDay() eq 1

    val second = SimpleTime(seconds = 1)
    second.toNanoOfDay() eq 1000000000L

    val halfPastSeven = SimpleTime(hours = 6, minutes = 30)
    halfPastSeven.toNanoOfDay() eq (6 * 60 + 30) * 60 * 1000000000L

}
