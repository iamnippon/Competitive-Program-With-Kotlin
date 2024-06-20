 fun main(){
     // Question: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/I

     val input = readln()
     val (a, b) = input.trim().split("\\s+".toRegex()).map { it.toInt() }
     if(a >= b){
         println("Yes")
        }else {
         println("No")
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