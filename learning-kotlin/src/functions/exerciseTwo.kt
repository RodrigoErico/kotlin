package functions
fun main() {
    //dateCalculator()
    println(showsNumberOfCharacters())
    println(calculateCubeValue())
    calculateMileToKilometer()
    stringFormatting()
}

/*
1-Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos
 */
fun dateCalculator() {

    val numberOfYears = 2
    val yearToMonths = numberOfYears * 12
    val monthsToDays = numberOfYears * 365
    val daysToHours = monthsToDays * 24
    val hoursToMinutes = daysToHours * 60
    val minutesToSeconds = hoursToMinutes * 60

    println("2 anos equivalem a:")
    println("$yearToMonths meses")
    println("$monthsToDays dias")
    println("$daysToHours horas")
    println("$hoursToMinutes minutos")
    println("$minutesToSeconds segundos")
}

//2-Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
fun showsNumberOfCharacters(): Int {
    val str = "Rodrigo"
    val numberOfCharacters = str.length
    return numberOfCharacters
}

//3-Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
fun calculateCubeValue(): Int{
    val cubo = 5
    val calculateCube = cubo * cubo * cubo
    return calculateCube
}

//4-Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
fun calculateMileToKilometer(){
    val mile = 1.0
    val mileToKilometer = mile * 1.6
    println("$mile é equivalente a $mileToKilometer km.")
}
/*
5-Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
*/
fun stringFormatting(string: String = "Arara"){
    println(string.replace(Regex("[aA]"), "x"))
}

/*
6-Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
*/
fun showsNumberOfCharacters2(str: String = "Rodrigo"): Int = str.length
fun calculateCubeValue2(cubo: Int = 5) = cubo*cubo*cubo
fun calculateMileToKilometer2(mile: Float = 1.0f) = mile * 1.6
