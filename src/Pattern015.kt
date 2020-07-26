/* Output



 */

fun main() {
    println("Pattern 15")
    for (i in 1..5) {
        for (j in 0 .. (5-i))
            print(" * ")
        println()
    }
}