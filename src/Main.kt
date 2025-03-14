import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    createList()
    println()
}

fun createList() {
    val n = readln().toIntOrNull()
    while (true) {
        if (n != null && n > 0) {
            val numbers = List(n) { Random.nextInt(-5..5) }
            println(numbers)
            numbers.toMutableList()
            val num2 = numbers.map {
                if (it % 2 == 0) it * 10
                else it
            }
            println(num2)
            val sumnum = num2.sumOf { it }
            println(sumnum)
            println(num2.filter { it > 0 })
            return
        } else {
            println("Ошибка, попробуй снова")
            createList()
            return
        }
    }
}















