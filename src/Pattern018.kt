/*Output

 A  A  A  A  A
 B  B  B  B
 C  C  C
 D  D
 E 

* */

fun main() {
    println("Pattern 18")
    for (i in 1..5) {
        for (j in 0..(5 - i))
            print(" ${(i+64).toChar()} ")
        println()
    }
}