fun main () {
    //Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Y
    val input = readLine()!!
    val parts = input.split(" ").map { it.toLong() }
    val a = parts[0]
    val b = parts[1]
    val c = parts[2]
    val d = parts[3]
    val muliply = (a % 100 )* (b % 100 % 100) * (c % 100 % 100) * (d % 100 % 100)
    val lastTwoDigits = muliply % 100
    println(String.format("%02d", lastTwoDigits))}