// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var removedStr = ""
  for (c in s) {
    if (c.isLetter()){
      removedStr += c
    }
  }
  return isPalIgnoreCase(removedStr)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}