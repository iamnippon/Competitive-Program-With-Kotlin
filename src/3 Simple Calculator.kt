fun main() {
    val input = readLine()!!

    val (x, y) = input.trim().split("\\s+".toRegex()).map { it.toInt() }

    val summation = x + y
    val multiplication = x * y
    val subtraction = x - y

    println("$x + $y = $summation")
    println("$x * $y = $multiplication")
    println("$x - $y = $subtraction")
}
