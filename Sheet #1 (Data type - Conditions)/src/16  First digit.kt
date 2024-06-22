fun main(){
    // Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/P

    val input = readln()
    val parts = input.trim().split("".toRegex())
    if (parts[1].toInt() % 2 == 0 ){
        println("EVEN")
    } else{
        println("ODD")
    }
}