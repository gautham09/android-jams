fun main()
{
    val n = Integer.valueOf(readLine())
    if(n%5 == 0) print("$n is divisible by 5 ")
    else print("$n is not divisible by 5 ")
    if(n%11 == 0) print("and it is divisible by 11")
    else print ("and it is not divisible by 11")
}
