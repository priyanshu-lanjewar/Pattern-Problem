/* Output

 A
 B  B
 C  C  C
 D  D  D  D
 E  E  E  E  E

 */
fun main() {
    println("Pattern 14")

    for(i in 'A'..'E') {
        for (j in 'A'..i)
            print(" $i ")
        println()
    }
}