/* output

 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1

 */
fun main() {
    println("Pattern 9 \n")
    for(j in 5 downTo 1){
        for(i in 5 downTo 1)
            print(" $i ")
        println()
    }
}