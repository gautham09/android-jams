fun absolute(num : Int): Int {
    return (if(num < 0) num*(-1) else num)
}
fun main() {
    var answer: Int = absolute(-15)
    print("$answer")
}
