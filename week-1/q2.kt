fun main() {
    val numbers = arrayOf<Int>(6, 5, 10)
    var max:Int = numbers[0]
    
    for (num in numbers){
        if(num > max) max = num
    }
    print("$max")
}
