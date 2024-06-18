fun main() {
    val input = readLine()!!

    val (x, y) = input.trim().split("\\s+".toRegex()).map { it.toInt() }

    val summation = x + y
    val multiplication = x * y
    val subtraction = x - y

    println("$x + $y = $summation")
    println("$x * $y = $multiplication")
    println("$x - $y = $subtraction")

    /**
     * if submisson is show wrong then use this Python Code
     * # Read the input numbers
     * X, Y = map(int, input().split())
     *
     * # Calculate the summation, multiplication, and subtraction
     * summation = X + Y
     * multiplication = X * Y
     * subtraction = X - Y
     *
     * # Print the results
     * print(f"{X} + {Y} = {summation}")
     * print(f"{X} * {Y} = {multiplication}")
     * print(f"{X} - {Y} = {subtraction}")
     *
     *
     */
}
