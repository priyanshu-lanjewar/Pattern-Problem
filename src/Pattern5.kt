/* Output

 A  B  C  D  E
 A  B  C  D  E
 A  B  C  D  E
 A  B  C  D  E
 A  B  C  D  E

 */
fun main() {
    println("Pattern 5 \n")
    for(i in 0 until 5){
        for(j in 'A' .. 'E')
            print(" $j ")
        println()
    }
}