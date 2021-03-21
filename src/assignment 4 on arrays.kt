import java.util.*

fun main(){
    objectsArray("pen","bed","phone","chair")
    cities()
    numbers()
    var name=student("Beldine","Kenya","AkiraChix")
    println(name)

}
fun objectsArray(pen:String,bed:String,phone:String,chair:String){
    var objects= arrayOf(pen,bed,phone,chair)
    println(Arrays.toString(objects))

}
fun cities(){
    var cities= arrayOf("Harare","Mumbai","Dodoma","Jakarta")
    println(cities[0].capitalize()+"," + cities[1].capitalize() +"," +cities[2].capitalize()+"," + cities[3].capitalize() +",")

}
fun numbers(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers.component2()+numbers.component5()
    println(total)
    var index = numbers.indexOf(158)
    println(index)
    var int=(numbers.sortedArray())
    for (element in int){
        println(element)

    }    }
fun student(name:String,country:String,school:String):String{
    var String= arrayOf(name,country,school)
    return(Arrays.toString(String))
}


