/*output

 1  2  3  4  5
 1  2  3  4
 1  2  3
 1  2
 1 

*/

fun main() {
    println("Pattern 17")
    for (i in 1..5){
        for (j in 1 .. (6-i))
            print(" $j ")
        println()
    }
}