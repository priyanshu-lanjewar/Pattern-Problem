/* Output

 E  D  C  B  A
 E  D  C  B  A
 E  D  C  B  A
 E  D  C  B  A
 E  D  C  B  A

 */
fun main() {
    println("Pattern 7 \n")
    for(j in 0 until 5){
        for(i in 'E' downTo  'A')
            print(" $i ")
        println()
    }
}