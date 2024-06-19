fun main() {
    val input = readLine()!!
    val (A,B,C,D) = input.trim().split("\\s+".toRegex()).map { it.toInt() }
    val X = (A*B)-(C*D)
    println("Difference = $X")
}