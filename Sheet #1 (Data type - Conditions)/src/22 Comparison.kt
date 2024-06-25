fun main(){
    //Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/V

    val input = readLine()!!
    val parts = input.split(" ").map { it }
    val a = parts[0]
    val b = parts[2]
    val c = parts[1]
    if (c == "="){
        if (a.toInt() == b.toInt()){
            println("Right")
        }else{
            println("Wrong")
        }
    } else if (c == ">"){
        if (a.toInt() > b.toInt()){
            println("Right")
        }else{
            println("Wrong")
        }
    }else {
        if (a.toInt() < b.toInt()){
            println("Right")
        }else{
            println("Wrong")
        }
    }

}