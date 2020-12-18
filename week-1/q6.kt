 fun main(){
    
    val scanner = Scanner(System.`in`)
    val c = scanner.next().single()
    
    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
    println("$c is an alphabet")
    else println("$c is not an alphabet")
}
