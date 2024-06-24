fun main(){
    // Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/S

    val input = readln().toDouble()

    if (input in 0.0..25.0) {
        println("Interval [0,25]")
    } else if (input > 25 && input <= 50) {
        println("Interval (25,50]")
    } else if (input > 50 && input <= 75) {
        println("Interval (50,75]")
    } else if (input > 75 && input <= 100) {
        println("Interval (75,100]")
    } else {
        println("Out of Intervals")
    }
    }