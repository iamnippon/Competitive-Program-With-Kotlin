fun main(){
    // Question: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/M

val input = readln()
    val digit = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9').toString()
    val capital = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z').toString()
    if (input in digit){
        println("IS DIGIT")
    } else if (input in capital){
        println("ALPHA\n" +
                "IS CAPITAL")
    } else{
        println("ALPHA\n" +
                "IS SMALL")
    }


}