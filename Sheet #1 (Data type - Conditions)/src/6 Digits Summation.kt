import kotlin.math.abs

fun main(){

    //Questions: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/F
    val input = readLine()!!
    val (x, y) = input.trim().split(" ".toRegex()).map { it.toLong() }
    val xLast = getLastDigit(x)
    val yLast = getLastDigit(y)
    println(xLast+yLast)
}
fun getLastDigit(number: Long): Long {
    return abs(number) % 10

    // input
    // 13 12
    //----------
    // output
    // 5


}