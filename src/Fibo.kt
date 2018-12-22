fun fibonacci(): Sequence<Int> = sequence {

    yield(0)

    var current = 1
    var before = 0
    var next = 0
    while(true) {
        yield(current)
        next = current + before
        before = current
        current = next
    }
}

fun main(args: Array<String>) {
    println(fibonacci().take(4).toList().toString() == "[0, 1, 1, 2]")

    println(fibonacci().take(10).toList().toString() == "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]")
}