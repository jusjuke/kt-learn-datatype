import kr.co.webmill.javacode.Vacation
import java.math.BigDecimal

fun main(args: Array<String>) {
    val myInt = 22
    var myLong = 22L
    myLong = myInt.toLong()
    println(myLong)
    val myByte: Byte = 111
    var myShort: Short = 33
    myShort = myByte.toShort()
    println(myShort)

    var myDouble = 68.196
    println("myDouble is ${myDouble is Double}")

    val myFloat = 78.243f
    println("myFloat is ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myChar = 65
    println(myChar.toChar())

    val isVacation = false
    println(Vacation().isVacationTime(isVacation))

    val names = arrayOf("Jone", "Jane", "Joe")
    val longs1 = arrayOf<Long>(1, 2, 4, 6)

    println(longs1 is Array<Long>)

    val evenNumbers = Array(16){i -> i * 2}

    for(number in evenNumbers) {
        println(number)
    }
    val allZero = Array<Int>(100){0}
    var someArray: Array<Int>
    someArray = arrayOf(1,2,4,5)
    someArray = Array(10){i -> (i + 1) * 10}
    for(number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf(10, "Hello", BigDecimal(10.55), 20L)
    for(number in mixedArray) {
        println(number)
    }
    println(mixedArray.isArrayOf<Any>())

    Vacation().printNumber(evenNumbers.toIntArray())
    val intArray = intArrayOf(1, 2, 3)
    Vacation().printNumber(intArray)
    var someIntArray = IntArray(5)

    val convertedArray: Array<Int> = intArray.toTypedArray()
    for(number in convertedArray) {
        println(number)
    }




}