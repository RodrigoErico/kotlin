package functions

fun main() {
    println(averageGrade("Rodrigo",9f, 566, true, 10f, 3f, "Melancia", 4.5f, 7.8f))
}

fun <K, T>averageGrade(name: K, vararg grades: T): Float {
    var sum = 0f
    for (n in grades) {
        if (n is Float) {
            sum += n
        }
    }
    return (sum / grades.size)
}