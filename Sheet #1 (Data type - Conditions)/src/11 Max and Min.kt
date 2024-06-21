fun main(){
 // question: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/K
    val input = readln()
    val (a, b, c) = input.trim().split("\\s+".toRegex()).map { it.toInt() }

    if (a < b && a < c){
        print( "$a ")
        if (b > c){
            print(b)
        } else {
            print(c)
        }
    } else if (b < a && b < c){
        print("$b ")
        if (a > c){
            print(a)
        } else {
            print(c)
        }
    } else if (c < a && c < b) {
        print("$c ")
        if (a > b) {
            print(a)
        } else {
            print(b)
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
}
