/* Output

 A  A  A  A  A
 B  B  B  B  B
 C  C  C  C  C
 D  D  D  D  D
 E  E  E  E  E

 */
fun main() {
    println("Pattern 4 \n")
    for(i in 'A'..'E'){
        for(j in 0 until  5)
            print(" $i ")
        println()
    }
}