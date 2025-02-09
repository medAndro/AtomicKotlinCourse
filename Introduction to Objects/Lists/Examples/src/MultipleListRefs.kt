// Lists/MultipleListRefs.kt
import atomictest.eq

fun main() {
  val first = mutableListOf(1)
  val second: List<Int> = first // 아톰 20 에일리어싱, List<Int>로 지정하지 않으면 코틀린이 가변객체로 추론함
  second eq listOf(1)

  first += 2
  // second sees the change:
  second eq listOf(1, 2)
}