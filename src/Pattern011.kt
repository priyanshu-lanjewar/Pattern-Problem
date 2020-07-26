/* output

 1
 1  2
 1  2  3
 1  2  3  4
 1  2  3  4  5 

 */

fun main() {
    println("Pattern 11")

    for(i in 1..5) {
        for (j in 1..i)
            print(" $j ")
        println()
    }
}