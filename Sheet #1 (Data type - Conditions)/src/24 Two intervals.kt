fun main(){
    val input = readLine()!!
    val parts = input.split(" ").map { it.toInt() }
    val l1 = parts[0]
    val r1 = parts[1]
    val l2 = parts[2]
    val r2 = parts[3]
    val intersectionStart = maxOf(l1, l2)
    val intersectionEnd = minOf(r1, r2)
    if (intersectionStart <= intersectionEnd) {
        println("$intersectionStart $intersectionEnd")
    } else {
        println("-1")
    }

}