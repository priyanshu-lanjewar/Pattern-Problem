/* output

 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *

 */
fun main() {
    println("Pattern 1  5 x 5 matrix of * ")
    for(i in 0 until 5) {
        for (j in 0 until 5)
            print(" * ")
        println()
    }
}