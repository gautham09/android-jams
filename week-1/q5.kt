 fun main(){
    
    val S1 : Int = Integer.valueOf(readLine())
    val S2 : Int = Integer.valueOf(readLine())
    val S3 : Int = Integer.valueOf(readLine())
    
    if (S1== S2 && S2 == S3)println("It is an equilateral triangle")
    else if (S1 == S2 && S2 != S3) println("It is an isosceles triangle")
    else if (S2 == S3 && S1 != S2) println("It is an isosceles triangle")
    else if (S1 == S3 && S2 != S3) println("It is an isosceles triangle")
    else if(S1 != S2 && S2 != S3 && S3 != S1)println("It is a scalene triangle")
}
