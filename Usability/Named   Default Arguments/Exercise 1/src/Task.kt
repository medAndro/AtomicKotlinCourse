// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(val side1: Double=1.0, val side2: Double=2.0, val color: String="yellow"){
  override fun toString(): String {
    return "$color rectangle $side1 x $side2"
  }
}

fun main() {
  println(Rectangle())

  println(Rectangle(side2 = 3.0))
  println(Rectangle(color="Blue", side2 = 0.5))
}