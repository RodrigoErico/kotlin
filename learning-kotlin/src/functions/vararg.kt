package functions

fun main() {
    println(averageGrade(43534543,"Rodrigo",9f, 566, true, 3.5f, "Melancia", 4.5f, 7.8f))
}

fun <K, T>averageGrade(anyValue: Any,name: K, vararg grades: T): Float {
    var sum = 0f
    for (n in grades) {
        if (n is Float) {
            sum += n
        }
    }
    return (sum / grades.size)
}