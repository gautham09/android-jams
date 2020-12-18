fun main(){
    val n : Int = Integer.valueOf(readLine())
    var i = 0
    while (i < n)	{
        var q = 0
        while (q <= i)	{
            print("#")
            q++
        }
        println()
        i++
    }    
}
