// Haga un algoritmo que solicite el ingreso de 2 números, valide cual es mayor o si son iguales

fun main() {

println("Ingrese un numero a:")
val a = readLine()!!.toInt()
println("Ingrese un numero b:")
val b = readLine()!!.toInt()
if (a > b) {
println("$a es mayor que $b")
} else {
if (b > a) {
println("$b es mayor que $a")
} else {
println("$a y $b son iguales")
}
}
println("\n\nTerminó la estructura")
}