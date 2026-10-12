// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU\n")

    println("""
        (a) Margherita
        (b) Quattro Stagioni
        (c) Seafood
        (d) Hawaiian
    """.trimIndent())

    print("Choose your pizza (a-d): ")

    val order = readln().lowercase()

    if (order.length == 1 && order[0] in 'a'..'d') {
        println("Order accepted")
    }
    else {
        println("Invalid choice!")
    }
}
