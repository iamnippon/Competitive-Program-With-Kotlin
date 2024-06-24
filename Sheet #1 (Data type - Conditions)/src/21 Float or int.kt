fun main(){
    //Question https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/U

    val input = readLine()!!.toFloat()
    val decimalPlace = input - input.toInt()

    if (input % 1 == 0f){
        println("int ${input.toInt()}")
    }else{
        println("float ${input.toInt()} ${"%.3f".format(decimalPlace)}")
    }


}