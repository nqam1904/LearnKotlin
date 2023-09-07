fun main(args: Array<String>) {
    val h = 7
    for (i in 1..h) {
        for (j in 1..h) {
            if (j == 1 || j == h || i == j)
                print("*")
            print("\t")
        }
        println()
    }
}