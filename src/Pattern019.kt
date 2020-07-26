/*output

 A  B  C  D  E
 A  B  C  D
 A  B  C
 A  B
 A

*/

fun main() {
    println("Pattern 19")
    for (i in 1..5){
        for (j in 1 .. (6-i))
            print(" ${(j+64).toChar()} ")
        println()
    }
}