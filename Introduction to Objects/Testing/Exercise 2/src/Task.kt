// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a+b+c
fun main() {
  sum(0,0,0) eq 0
  sum(-999,999,999) eq 999
  sum(1,1,-888) neq -890
  sum(1,2,3) neq 0
  sum(9,9,9) eq 27
}