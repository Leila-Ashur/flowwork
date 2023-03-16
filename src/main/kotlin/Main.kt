fun main() {
    oddNumbers(1)
    naming(arrayOf("leila"))
    allNumbers()


}
fun oddNumbers(num:Int) {
    for (num in 1..100) {
        if (num % 2 != 0) {
            println(num)
        }
    }
}

fun naming(names:Array<String>):Int{
    var name = 0
    for (name in names){
        if(name.length >5){
            name


        }
    }
   return name

}
//1-5serve glass of milk
//6-15 serve bottle of fanta orange
//else serve cocacola
fun robotParty(serving:String){
    if (serving in 0..5){
        println("glass of milk")
    }
else if (serving in 6..15){
    println("bottle of fanta orange")
    }
else println("cocacola")

}



fun allNumbers() {
for (nums in 1..100){
     when{

         nums % 3 == 0 -> println("Fizz")
         nums% 5 == 0 -> println("Buzz")
         nums %3 ==0 && nums%5 ==0 -> println("FizzBuzz")




     }
}

}


