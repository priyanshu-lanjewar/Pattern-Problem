/* output

 1
 2  2
 3  3  3
 4  4  4  4
 5  5  5  5  5 

 */

fun main() {
    println("Pattern 12")

    for(i in 1..5) {
        for (j in 1..i)
            print(" $i ")
        println()
    }
}