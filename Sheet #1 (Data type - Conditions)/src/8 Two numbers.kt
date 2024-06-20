fun main(){

    // Questions: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/H

    val input = readln()
    val (a, b) = input.trim().split("\\s+".toRegex()).map { it.toFloat() }
    val division = a/b
    val ceil = division.toInt() + 1
    val floor = ceil-1

    println("floor ${a.toInt()} / ${b.toInt()} = $floor")
    if (a == b ){
        println("ceil ${a.toInt()} / ${b.toInt()} = 1")
    }else {
        println("ceil ${a.toInt()} / ${b.toInt()} = $ceil")
    }
    if (division - floor >= 0.5 ){
        val round = floor + 1
        println("round ${a.toInt()} / ${b.toInt()} = $round")
    } else {
        val round = floor
        println("round ${a.toInt()} / ${b.toInt()} = $round")
    }


    // input
    // 10 3
    //----------
    // output
    // floor 10 / 3 = 3
    // ceil 10 / 3 = 4
    // round 10 / 3 = 3
    //----------

    // input
    // 10 4
    //----------
    // output
    // floor 10 / 4 = 2
    // ceil 10 / 4 = 3
    // round 10 / 4 = 3

    //----------
    // input
    // 10 6
    //----------
    // output
    // floor 10 / 6 = 1
    // ceil 10 / 6 = 2
    // round 10 / 6 = 2

}
