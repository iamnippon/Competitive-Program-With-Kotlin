fun main(){
    // Questions: https://codeforces.com/problemset/problem/12/A

    val arr = Array(3) { readLine()!! }
    val n = arr.size
    val m = arr[0].length
    var flag = true
    for(i in 0 until n){
        for(j in 0 until m){
            if(arr[i][j] != arr[n - 1 - i] [m - 1 - j]){
                flag = false
                break
            }
        }
    }
    if(flag) println("YES")
    else println("NO")
}