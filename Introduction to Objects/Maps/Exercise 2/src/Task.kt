// Maps/Task2.kt
package mapsExercise2
import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()

  fun put(hamster: Hamster): Boolean =
    if (hamsters.size == maxCapacity)
      false
    else {
      hamsters += hamster
      true
    }

  fun get(name: String): Hamster {
    hamsters.forEach {
      if(it.name == name) return it
    }
    throw NoSuchElementException("No hamster called $name")
  }
}

fun main() {
  val cage = Cage(2)
  cage.put(Hamster("Alice")) eq true
  cage.get("Alice") eq "Hamster('Alice')"
  capture {
    cage.get("Bob")
  } eq "NoSuchElementException: " +
    "No hamster called Bob"
}