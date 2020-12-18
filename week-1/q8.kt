fun factorial(n : Int): Int {
    var factorial: Int = 1
    var i = n
    while (i > 0){
        factorial *= i
        i--
    }
    return factorial
}

fun main() {
   var n: Int = Integer.valueOf(readLine())
    var sum = 0
    while (n > 0)
    {
        sum += factorial(n)
        n--
    }
    print("sumOffactorials = $sum")
}
     
