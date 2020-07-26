/* output

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *

 */
fun main() {
    println("Pattern 10")

    for(i in 0..4) {
        for (j in 0..i)
            print(" * ")
        println()
    }
}