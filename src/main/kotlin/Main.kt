fun main(){
    caps()
    maths()
}

//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun caps(){
    var cities = arrayOf("harare","mumbai", "dodoma","jakata")
    println(cities.map {it.capitalize()})
}



//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order
fun maths(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)

    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}