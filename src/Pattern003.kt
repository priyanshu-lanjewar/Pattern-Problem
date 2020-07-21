/* output

 1  2  3  4  5
 1  2  3  4  5
 1  2  3  4  5
 1  2  3  4  5
 1  2  3  4  5

 */
fun main() {
    println("Pattern 3 \n")
    for(i in 0 until 5){
        for(j in 1 .. 5)
            print(" $j ")
        println()
    }
}