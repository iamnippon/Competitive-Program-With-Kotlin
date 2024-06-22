fun main() {
    // Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/O

    val input = readLine()!!
    val parts = input.trim().split("\\s*([+\\-*/])".toRegex())
    val operatorRegex = Regex("[+\\-*/]")
    val operator = operatorRegex.find(input)!!.value
    val a = parts[0].toInt()
    val b = parts[1].toInt()
    when (operator) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> println(a / b)
    }
}


