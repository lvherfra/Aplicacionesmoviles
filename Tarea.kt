#Ejercicio 2

fun main() {

    // Se crean dos variables con la cantidad de notificaciones
    val morningNotification = 51
    val eveningNotification = 135

    // Se llama a la función enviando la cantidad de notificaciones
    printNotificationSummary(morningNotification)

    // Se vuelve a llamar la función con otro valor
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {

    // Condicional: verifica si las notificaciones son menores a 100
    if (numberOfMessages < 100) {

        // Si son menos de 100, muestra el número exacto
        println("You have $numberOfMessages notifications.")

    } else {

        // Si son 100 o más, muestra un mensaje genérico
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

#Este ejercicio es para - Uso de funciones - Parámetros -Condicional IF

#ejercicios 3 

fun main() {

    // Se definen tres edades diferentes
    val child = 5
    val adult = 28
    val senior = 87

    // Variable que indica si es lunes
    val isMonday = true

    // Se imprime el precio del ticket llamando a la función ticketPrice
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {

    // Se usa WHEN que es como un switch avanzado
    return when {

        // Si la edad es menor o igual a 12
        age <= 12 -> 15

        // Si la edad está entre 13 y 60
        age in 13..60 -> if (isMonday) 25 else 30

        // Si la edad es mayor o igual a 61
        age >= 61 -> 20

        // En caso de que no cumpla ninguna condición
        else -> -1
    }
}

## Uso de #when Rangos 13..60 Condicional dentro de una condición Retorno de valores en funciones
## ejercicio 4

fun main() {

    // Conversión de Celsius a Fahrenheit
    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit"
    ) { celsius -> (celsius * 9 / 5) + 32 }

    // Conversión de Kelvin a Celsius
    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius"
    ) { kelvin -> kelvin - 273.15 }

    // Conversión de Fahrenheit a Kelvin
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

    // Se recibe una función como parámetro
    conversionFormula: (Double) -> Double
) {

    // Se ejecuta la función de conversión enviada
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))

    // Se imprime el resultado
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
## Funciones lambda - Pasar funciones como parámetros - Formateo de números

//ejercicio 5

fun main() {

    // Se crea un objeto de la clase Song
    val song = Song("Shape of You", "Ed Sheeran", 2017, 1500)

    // Se imprime la descripción de la canción
    song.printDescription()

    // Se imprime si es popular o no
    println("Is popular: ${song.isPopular}")
}

class Song(

    // Propiedades de la clase
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {

    // Propiedad calculada
    val isPopular: Boolean

        // Getter que evalúa si la canción tiene más de 1000 reproducciones
        get() = playCount >= 1000

    // Método de la clase
    fun printDescription() {

        // Muestra la información de la canción
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

## Clases - Objetos - Propiedades - Getter personalizado


##ejercicios 6

fun main() {

    // Se crea una persona sin referidor
    val amanda = Person("Amanda", 33, "play tennis", null)

    // Se crea otra persona referida por Amanda
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    // Se muestran los perfiles
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(

    // Propiedades de la persona
    val name: String,
    val age: Int,

    // Hobby puede ser nulo
    val hobby: String?,

    // Referidor puede ser nulo
    val referrer: Person?
) {

    fun showProfile() {

        // Imprime nombre
        println("Name: $name")

        // Imprime edad
        println("Age: $age")

        // Si tiene hobby lo muestra
        if (hobby != null) {
            print("Likes to $hobby. ")
        }

        // Si tiene referidor muestra su información
        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {

            // Si no tiene referidor
            println("Doesn't have a referrer.")
        }

        println()
    }
}

## Objetos que contienen otros objetos - Valores nulos (null) - Tipos opcionales (String?) - Relación entre clases

// fun indica que se está declarando una función. // printNotificationSummary es el nombre de la función. // numberOfMessages: Int es un parámetro, es decir, un dato que recibe la función. // El código dentro de {} es lo que ejecuta la función.

// main() sirve para: Crear variables - Llamar funciones - Probar la lógica del programa

