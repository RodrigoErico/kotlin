package variables.and.data.types

fun main() {
    var age = 32
    age += 1 // age++
    age -= 5 // age--
    age *= 2
    age /= 4

    age = age + 19
    println(age)

    val isPar = 10 % 2
    val number: Float = 10 / 3f
    println(isPar)
    println(number)
}