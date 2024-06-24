 fun main(){
    // Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/R

    val input = readln()
    val year = input.toLong() / 365
     val month = (input.toLong() % 365) / 30
     val days = (input.toLong() % 365) % 30
     println("$year years")
     println("$month months")
     println("$days days")

 }