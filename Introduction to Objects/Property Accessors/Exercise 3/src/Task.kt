// PropertyAccessors/Task3.kt
package propertyAccessorsExercise3
import atomictest.eq

class MessageStorage{
    private val _messages: MutableList<String> = mutableListOf()
    // private val _messages = mutableListOf<String>()와 같음
    val messages: List<String>
        get() = _messages.toList() //toList()를 생략가능 하지만 외부에서 캐스팅을 통해 내부 데이터 변조 가능
    fun addMessage(message: String) {
        _messages.add(message) // _messages += message 가능
    }
}

fun main() {

  val messageStorage = MessageStorage()
  messageStorage.addMessage("first")
  messageStorage.addMessage("second")
  messageStorage.messages eq listOf("first", "second")
  // doesn't compile:
//  messageStorage.messages.remove("first")

}