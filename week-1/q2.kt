fun main() {
 numbers: Int = ArrayOf<Int>(0 , 0, 0)   
  for (index in 0..2) {
        numbers[index] = Integer.valueOf(readLine())
  }
 var max:Int = numbers[0]
  for (num in numbers){
        if(num > max) max = num
    }
    print("the max of given 3 numbers is $max")
}
