class Person(val id: Int, var name: String) {

    val isActive: Boolean
        get() = false

}

class Rectangle(val width: Int, val height: Int) {

    val isSquare: Boolean
    get() = width == height

}




fun main(args: Array<String>) {

    val template = """
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
            </tr>
        </table>
    """.trimIndent()

    println(template)
    println("Hello world!")
    println(max(3, 5))
    println(2.678e4)

    val p = Person(1000, "John")

    p.name = "John Owl"
    println("${p.name} ${p.isActive}")




    val list1 = arrayOf(1, 2, 3, 4)

    list1
        .map(::multBy3)
        .filter(::filterEven)
        .toList()
    println()
    list1.asSequence()
        .map(::multBy3)
        .filter(::filterEven)
        .toList()

    val numbers = sequence {
        var x = 0
        while(true) {
            yield(x++)
        }

    }

    val l = numbers.take(5).toList()

}



fun multBy3(n: Int): Int {
    print("multBy3($n) ")
    return n * 3
}
fun filterEven(n: Int): Boolean {
    print("filterEven($n) ")
    return n % 2 == 1
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}