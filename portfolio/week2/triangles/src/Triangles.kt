// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle
    if (a<b+c && b<a+c && c<a+b){
        return true
    }
    else {
        return false
    }
}
fun triangleArea(triangle: Triangle): Double {
    val (a, b, c) = triangle
    val s = (a+b+c)/2
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    return area
}