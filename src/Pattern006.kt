/* Output

 E  D  C  B  A
 E  D  C  B  A
 E  D  C  B  A
 E  D  C  B  A
 E  D  C  B  A 

 */
fun main() {
    println("Pattern 6 \n")
    for(i in 0 until 5){
        for(j in 'E' downTo  'A')
            print(" $j ")
        println()
    }
}