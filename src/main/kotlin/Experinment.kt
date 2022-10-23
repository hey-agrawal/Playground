fun main() {

    println("Enter number")

    val number = readln().toLong()

    if (number>999999999 && number<10000000000){
        println("number is correct!")
    } else {
        println("number is not correct!")
    }

}