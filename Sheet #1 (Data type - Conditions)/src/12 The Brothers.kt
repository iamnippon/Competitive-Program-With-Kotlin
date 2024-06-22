 fun main(){
     // Question: https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/L

     val input1 = readln()
     val input2 = readln()
     val (F1, S1) = input1.trim().split(" ".toRegex()).map { it.toString() }
     val (F2, S2) = input2.trim().split(" ".toRegex()).map { it.toString() }
     if (S1 == S2){
         println("ARE Brothers")
     } else {
         println("NOT")
     }
 }