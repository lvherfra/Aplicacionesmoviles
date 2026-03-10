ejercicios 2 

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
#ejercicios 3 

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age <= 12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        age >= 61 -> 20
        else -> -1
    }
}
ejercicio 4

fun main() {

    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit"
    ) { celsius -> (celsius * 9 / 5) + 32 }

    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius"
    ) { kelvin -> kelvin - 273.15 }

    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin"
    ) { fahrenheit -> ((fahrenheit - 32) * 5 / 9) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFor…
//ejercicio 5

fun main() {
    val song = Song("Shape of You", "Ed Sheeran", 2017, 1500)

    song.printDescription()
    println("Is popular: ${song.isPopular}")
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {

    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}
//ejercicios 6

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        if (hobby != null) {
            print("Likes to $hobby. ")
        }

        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }

        println()
    }
}
