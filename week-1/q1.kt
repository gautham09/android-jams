fun main()
 {
	val n = Integer.valueOf(readLine())
    var result = "positive"
    if(n < 0) result = "negative"
    if(n == 0) result = "neither negative nor positive"
    println("$n is $result")
}
