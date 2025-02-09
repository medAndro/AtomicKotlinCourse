// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = (h * (x + y)) / 2.0 //사다리꼴

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  rectangleArea(5, 4) eq 20
  rectangleArea(8, 6) eq 48
  trapezoidArea(2, 8, 4) eq 20
}