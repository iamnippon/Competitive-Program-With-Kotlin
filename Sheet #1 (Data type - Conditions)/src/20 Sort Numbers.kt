fun main(){
 //Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/T

    val input = readLine()!!
    val (a, b, c) = input.split(" ").map { it.toInt() }
    val list = mutableListOf(a, b, c)
    val sortedList = list.sorted()

    for (i in sortedList){
        println(i)
    }

    println()

    for (i in list){
        println(i)
    }



}