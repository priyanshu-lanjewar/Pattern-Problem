/* output

 5  5  5  5  5
 4  4  4  4  4
 3  3  3  3  3
 2  2  2  2  2
 1  1  1  1  1

 */
fun main() {
    println("Pattern 8 \n")
    for(i in 5 downTo 1){
        for(j in 5 downTo 1)
            print(" $i ")
        println()
    }
}