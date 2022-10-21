fun main()
{
    println("Enter number")
    val num = readln().toInt()

    for (i in 1..num) {
        val j=1
        for (j in j..i) {
            print("* ")
        }

        println()
    }
}