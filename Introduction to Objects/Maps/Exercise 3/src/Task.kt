// Maps/Task3.kt
package mapsExercise3
import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters: MutableMap<String, Hamster> =
    mutableMapOf<String, Hamster>()

  fun put(hamster: Hamster): Boolean =
    if (hamsters.size == maxCapacity)
      false
    else {
      hamsters[hamster.name] = hamster
      true
    }

  fun get(name: String): Hamster {
    return hamsters.getOrElse(name){
      throw NoSuchElementException("Key $name is missing in the map.")
    }
  }
}

fun main() {
  val cage = Cage(2)
  cage.put(Hamster("Alice")) eq true
  cage.get("Alice") eq "Hamster('Alice')"
  capture {
    cage.get("Bob")
  } eq "NoSuchElementException: " +
    "Key Bob is missing in the map."
}