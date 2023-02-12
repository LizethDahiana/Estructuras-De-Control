// Algoritmo que imprima los numeros pares del 1 al n
fun main(){
print("Ingrese un numero: ")
val n = readLine()!!.toInt()
var i = 1
do {
if (i % 2 == 0) {
println(i)
}
i++
} while (i <= n)
}
