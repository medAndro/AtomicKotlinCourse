// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
    var ans = ""
    for (i in 0 until s.length step 2) {
        ans += s[i]
    }
    return ans
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/