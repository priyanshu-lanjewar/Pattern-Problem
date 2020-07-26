/*Output

 1  1  1  1  1
 2  2  2  2
 3  3  3
 4  4
 5

* */

fun main() {
    println("Pattern 16")
    for (i in 1..5){
        for (j in 0 .. (5-i))
            print(" $i ")
        println()
    }
}