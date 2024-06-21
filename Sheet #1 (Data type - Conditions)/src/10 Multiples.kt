fun main(){
    // Question: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/J
    val input = readln()
    val (a, b) = input.trim().split("\\s+".toRegex()).map { it.toLong() }
    if (a > b){
        val result = a % b
        if (result == 0L){
            println("Multiples")
        } else {
            println("No Multiples")
        }
    } else {
        val result = b % a
        if (result == 0L){
            println("Multiples")
        } else {
            println("No Multiples")
        }
    }

    // input
    // 10 9
    //----------
    // output
    // Yes
    //----------

    // input
    // 5 5
    //----------
    // output
    // Yes

    //----------
    // input
    // 5 7
    //----------
    // output
    // No

}
