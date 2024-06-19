fun main() {

    // Questions: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/D

    val input = readLine()!!
    val (A,B,C,D) = input.trim().split("\\s+".toRegex()).map { it.toInt() }
    val X = (A*B)-(C*D)
    println("Difference = "+X)

    // input
    // 1 2 3 4
    //----------
    // output
    // Difference = -10

    // input
    // 2 3 4 5
    //----------
    // output
    // Difference = -14

    // input
    // 4 5 2 3
    //----------
    // output
    // Difference = 14

}