/*output

 5  4  3  2  1
 5  4  3  2
 5  4  3
 5  4
 5

*/

fun main() {
    println("Pattern 21")
    for (i in 1..5){
        for (j in 5 downTo i)
            print(" $j ")
        println()
    }
}