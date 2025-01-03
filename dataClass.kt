data class User(val name: String, val age: Int)

fun main() {
    val user = User("Cristian", 30)
    println(user) // Output: User(name=Cristian, age=30)
    
    val updatedUser = user.copy(age = 31)
    println(updatedUser) // Output: User(name=Cristian, age=31)
}
