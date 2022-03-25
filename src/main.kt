//1.Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//-speak(speech: String) :Prints the string passed toit                (2
//points)
//-birthday( ) :Increments the human’s age by 1(2
//points)
//Create an instance of this human class and invoke all its functions
//2.Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
fun main() {
        var identity = Person("Cheko", 12, 12.8)
        println(identity.age)
        identity.eat(5)
        println(identity.weight)
        identity.Speak("I love coding in Kotlin")
        identity.Birthday()
        var Sharon = Human("Sharon","Chepkoech","chekochepkoech@gmail.com",7273737,"hush7827@!")
        println(Sharon.firstName.toString()+ " " +Sharon.email)

}
class Person(var name:String, var age:Int, var weight:Double) {
        fun eat(foodWeight: Int) {
                weight += foodWeight
                println("I am eating $foodWeight kgs of food.")
        }

        fun Speak(speech: String) {
                println(speech)

        }
        fun Birthday(){
               age = age++
                println(age)
        }
}
data class Human(var firstName: String, var secondName: String, var email: String, var phoneNumber:Int, var passsword: Any){

}
