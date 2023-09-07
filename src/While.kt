fun main(args: Array<String>) {
    var i = 0
    while (i <= 5){
        println(i)
        i++
    }
    println("Done i = $i")

    var n =0;
    while (n < 1 || n > 99){
        print("Please enter the number:")
        val s = readlnOrNull()
        if (s != null){
           n = s.toInt()
        }
    }
    println("The value is $n")
}