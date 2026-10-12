// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
fun main(args: Array<String>){
    val a = args[0].toIntOrNull()
    val b = args[1].toIntOrNull()
    val c = args[2].toIntOrNull()
    if (a != null && b != null && c != null){
        val s = (a+b+c)/3
        val grade = when (s){
            in 0..39 -> "Fail"
            in 40..69 -> "Pass"
            in 70..100 -> "Distinction"
            else -> "?"
        }
        println(grade)
    }
    else {
        println("Invalid grade")
    }
}