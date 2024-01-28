package functions

fun main() {
    println(averageGrade(9f, 10f, 3f, 4.5f, 7.8f))
}

fun averageGrade(vararg grades: Float): Float {
    var sum = 0f
    for (n in grades) {
        sum += n
    }
    return (sum / grades.size)
}