fun main(args: Array<String>) {

    print("Please enter number:")
    val s: String? = readlnOrNull()
    var number: Int = 0
    if (!s.isNullOrEmpty()){
        number = s.toInt()
        when (number){
            in 0..4 -> {
                println("Score is below average!")
            }
            in 5.. 7 -> {
                println("Score is above average!")
            }
            in 7..9 -> {
                println("Score is excellent!")
            }
            else -> println("number is valid!")
        }
    }
    else{
        println("Value is not empty string!")
    }


}