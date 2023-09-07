fun main(args: Array<String>) {
    var i = 0
    while (i <= 5) {
        println(i)
        i++
    }
    println("Done i = $i")

    var number = 0;
    while (number < 1 || number > 99) {
        print("Please enter the number:")
        val s = readlnOrNull()
        if (s != null) {
            number = s.toInt()
        }
    }
    println("The value is $number")

    var a = 1
    var total = 0
    do {
        total += a
        a++
    } while (a <= 5)
    println("Sum of number form 1 - 5: $total")

    while (true) {
        print("Bạn có muốn thoát chương trình không? (y/n)")
        val s: String? = readlnOrNull()
        if (s == "Y" || s == "y")
            break
    }
    println("Success")

    var n = 0
    while (true) {
        n++
        println("n:$n")
        if (n == 10) break
    }
}