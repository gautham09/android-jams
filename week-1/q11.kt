fun main(){
    val num : Int = Integer.valueOf(readLine())
    var orginalnum : Int = num
    var remainder : Int
    var answer : Int = 0
    
    while (orginalnum != 0){
        remainder = orginalnum%10
        answer += remainder*remainder*remainder
        orginalnum /= 10
    }
    
    if(answer == num) println("$num is an Armstrong number")
    else println("$num is not an Armstrong number")
}
