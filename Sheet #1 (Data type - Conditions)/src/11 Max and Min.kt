fun main() {
    // question: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/K
    val input = readln()
    val (a, b, c) = input.trim().split("\\s+".toRegex()).map { it.toInt() }

    if (a < b) {
        if (a < c) {
            print("$a ")
        } else {
            print("$c ")
        }
    } else if (b < c) {
        print("$b ")
    } else {
        print("$c ")
    }

    if (a > b) {
        if (a > c) {
            print("$a")
        } else {
            print("$c")
        }
    } else if (b > c) {
        print("$b")
    } else {
        print("$c")
    }

}

// input
// 1 2 3
//----------
// output
// 1 3
//----------

// input
// -1 -2 -3
//----------
// output
// -3 -1

//----------
// input
// 10 20 -5
//----------
// output
// -5 20

