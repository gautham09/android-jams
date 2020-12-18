 fun main() {
     val n : Int = Integer.valueOf(readLine())
     if(n < 0) print("Invalid input")
     else {
     var factorial: Int = 1 
     var i = n
     while (i > 0){
         factorial *= i
         i--
     }
     print("$factorial")
     }
}
     
