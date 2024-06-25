fun main() {

    val input = readLine()!!
    val parts = input.split(" ").map { it }
    val a = parts[0]
    val s = parts[1]
    val b = parts[2]
    val c = parts[4]
    if (s == "+") {
        if ((a.toInt() + b.toInt()) == c.toInt()) {
            println("Yes")
        } else {
            println(a.toInt() + b.toInt())
        }
    } else if (s == "-") {
        if ((a.toInt() - b.toInt()) == c.toInt()) {
            println("Yes")
        } else {
            println(a.toInt() - b.toInt())
        }
    } else if (s == "*") {
        if ((a.toInt() * b.toInt()) == c.toInt()) {
            println("Yes")
        } else {
            println(a.toInt() * b.toInt())
        }
    } else if (s == "/") {
        if ((a.toInt() / b.toInt()) == c.toInt()) {
            println("Yes")
        } else {
            println(a.toInt() / b.toInt())
        }
    }
}