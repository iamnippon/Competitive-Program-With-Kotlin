import kotlin.math.abs

fun main(){

    val input = readLine()!!
    val (x, y) = input.trim().split(" ".toRegex()).map { it.toLong() }
    val xLast = getLastDigit(x)
    val yLast = getLastDigit(y)
    println(xLast+yLast)
}
fun getLastDigit(number: Long): Long {
    return abs(number) % 10
}