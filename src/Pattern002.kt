/* output

 1  1  1  1  1
 2  2  2  2  2
 3  3  3  3  3
 4  4  4  4  4
 5  5  5  5  5

 */
fun main() {
    println("Pattern 2 \n")
    for(i in 1..5){
        for(j in 0 until  5)
            print(" $i ")
        println()
    }
}