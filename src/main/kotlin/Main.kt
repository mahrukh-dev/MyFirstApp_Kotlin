fun main() {

    val age = 24
    val name = "Rover"
    val layers = 5

    val border = "`._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("Happy Birthday, ${name}")
    printBorder(border, timesToRepeat)

    // Let's print a cake!
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age,layers)

    //this prints an empty line
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")

}

fun printBorder(border: String, timesToRepeat: Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
}

fun printCakeCandles(age: Int){
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age:Int){
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age:Int, layers:Int){
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}
