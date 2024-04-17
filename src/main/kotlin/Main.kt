fun checkGoingOut(age: Int, temperature: Int): String {
    return when {
        (age in 20..45 && temperature in -20..30) -> "Гуляй смело, и кто будет лезть скажи мне фамилию его"
        (age < 20 && temperature in 0..28) -> "Гуляй смело, и кто будет лезть скажи мне фамилию его"
        (age > 45 && temperature in -10..25) -> "Гуляй смело, и кто будет лезть скажи мне фамилию его"
        else -> "Сиди дома"
    }
}

fun main() {
    println(checkGoingOut(25, 15))
    println(checkGoingOut(18, 25))
    println(checkGoingOut(50, 20))
    println(checkGoingOut(30, 5))
    println(checkGoingOut(40, 35))
}
