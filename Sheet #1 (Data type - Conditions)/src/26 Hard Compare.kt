import kotlin.math.ln

fun main() {
    val input = readLine()!!
    val parts = input.split(" ").map { it.toLong() }
    val a = parts[0]
    val b = parts[1]
    val c = parts[2]
    val d = parts[3]

    val lhs = b * ln(a.toDouble())
    val rhs = d * ln(c.toDouble())

    if (lhs > rhs) {
        println("YES")
    } else {
        println("NO")
    }
}
