fun main(){

    // Questions: https://codeforces.com/problemset/problem/9/A

    val (y, w) = readLine()!!.split(" ").map { it.toInt() }
    val max = maxOf(y, w)
    val prob = 6 - max + 1
    val num = 6
    when(prob){
        1 -> println("1/6")
        2 -> println("1/3")
        3 -> println("1/2")
        4 -> println("2/3")
        5 -> println("5/6")
        6 -> println("1/1")
    }
}