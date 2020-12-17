fun absolute(num : Int): Int {
    return (if(num < 0) num*(-1) else num)
}
fun main() {
    val n = Integer.valueOf(readLine())
    var answer: Int = absolute(n)
    print("$answer")
}
