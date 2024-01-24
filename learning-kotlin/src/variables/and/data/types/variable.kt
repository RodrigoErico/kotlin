package variables.and.data.types

/**
 Type Bit
 Double 64
 Float 32
 Long 64
 Int 32
 Short 16
 Byte 8
 Boolean ?
 String ?
 Char ?
 */
fun main() {

    val c: Char = 'c'
    val text: String = "Texto"
    val isFalse: Boolean = true

    var double: Double = 10.3
    var float: Float = 10.4f
    var long: Long = 100000
    var int: Int = 20
    var short: Short = 10
    var byte: Byte = 23

//  kotlin faz inferência de tipo
    val name = "Rodrigo"
    val age = 33

//    interpolaçao de strings
    println("Me chamo $name e tenho $age de idade.")

    println("Double MAX ${Double.MAX_VALUE} and MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} and MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} and MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} and MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} and MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} and MIN ${Byte.MIN_VALUE}")

//    Unsigned - numeros sem sinais

    val uInt: UInt = 0u
    val uShort: UShort = 1000u
    val uLong: ULong = 4556u
    val uByte: UByte = 255u

    println(" ")
    println("Unsigned - numeros sem sinais")

    println("ULong MAX ${ULong.MAX_VALUE} and MIN ${ULong.MIN_VALUE}")
    println("UInt MAX ${UInt.MAX_VALUE} and MIN ${UInt.MIN_VALUE}")
    println("UShort MAX ${UShort.MAX_VALUE} and MIN ${UShort.MIN_VALUE}")
    println("UByte MAX ${UByte.MAX_VALUE} and MIN ${UByte.MIN_VALUE}")
}