// Lists/Task3.kt
package listsExercise3
import atomictest.eq

fun checkAnagrams(s1: String, s2: String): Boolean {
//  if (s1.length != s2.length) return false
//  val checkS2 = s2.toMutableList()
//  s1.forEach {
//    if (checkS2.contains(it)) {
//      checkS2.remove(it)
//    }
//  }
//  return checkS2.isEmpty()
  return s1.toList().sorted() == s2.toList().sorted()
}

fun main() {
  checkAnagrams("thing", "night") eq true
  checkAnagrams("leader", "dealer") eq true
  checkAnagrams("sector", "escort") eq true
  checkAnagrams("tablet", "battle") eq true
  checkAnagrams("friend", "finder") eq true
  checkAnagrams("senator", "treason") eq true
  checkAnagrams("terrain", "trainer") eq true
  checkAnagrams("teaching", "cheating") eq true

  checkAnagrams("pots", "stops") eq false
  checkAnagrams("escort", "sectors") eq false
  checkAnagrams("sections", "notices") eq false
}