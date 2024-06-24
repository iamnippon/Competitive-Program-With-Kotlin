fun main(){
    // Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Q

    val input = readLine()!!
    val (x , y) = input.trim().split("\\s+".toRegex()).map { it.toDouble() }
    if (x == 0.0 && y == 0.0){
        println("Origem")
    } else if (x == 0.0){
        println("Eixo Y")
    } else if (y == 0.0){
        println("Eixo X")
    } else if (x > 0 && y > 0){
        println("Q1")
    } else if (x < 0 && y > 0){
        println("Q2")
    } else if (x < 0 && y < 0){
        println("Q3")
    } else if (x > 0 && y < 0){
        println("Q4")
    }
}