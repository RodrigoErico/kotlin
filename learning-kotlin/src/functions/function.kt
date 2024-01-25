package functions

import kotlin.math.*

fun main() {
//    println("A soma de 10 e 5 é ${sum(10, 5)}.")
//    helloWorld()
//    funcString()
    funcMath()
}

fun sum (a: Int, b: Int): Int{
    return a + b
}

fun multiply (c: Int, d: Int) = c * d
fun helloWorld() = println("Hello, world")

// funcoes de strings
fun funcString(){
    val str = "Programação Kotlin."
    val number = "      43894-8340-234239       ".trim()
    println("Tamanho da string: ${str.length}")
    println("Posição index (0) da string: ${str[0]}")
    println(str.startsWith("ro")) // string começa com "Pro": false
    println(str.endsWith("Kotlin.")) // string termina com "Kotlin.": true
    println("Imprima apenas o Kotlin da string: ${str.substring(12, 18)}")
    println("Trocar a palavra Programação por Linguagem: ${str.replace("Programação", "Linguagem")}")
    println(str.lowercase())
    println(str.uppercase())
    println("Remove os espaços em branco no começo e no fim da string: ${number.trim()}")

}

// funcoes matematicas

fun funcMath() {
    println(max(5, 34))
    println(min(5, 34))
    println(sqrt(45.56f)) // raiz quadrada
    println(PI)
    println(E) // número de Euler
    println(round(344.77656))
}
