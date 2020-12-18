fun main(){
    val n : Int = Integer.valueOf(readLine())
    var Num = n
    var sum = 0
    while (Num > 0){
        if(Num%2 == 0) sum += Num
        Num--
    }
    print("Sum of all the even numbers till $n = $sum")
}
