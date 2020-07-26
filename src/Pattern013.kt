/* Output

 A
 A  B
 A  B  C
 A  B  C  D
 A  B  C  D  E 

 */
fun main() {
    println("Pattern 13")

    for(i in 'A'..'E') {
        for (j in 'A'..i)
            print(" $j ")
        println()
    }
}