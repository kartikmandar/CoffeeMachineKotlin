class City(val name: String) {
    private val defaultValue = (5 + 20 + 30)/3
    var degrees: Int = 57
        set (value) {
            if (value < -92 || value > 57) {
                field = defaultValue
            } else {
                field = value
            }
        }

}

fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing
    if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) {
        println(firstCity.name)
    } else if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) {
        println(secondCity.name)
    } else if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees) {
        println(thirdCity.name)
    } else if (firstCity.degrees == secondCity.degrees || firstCity.degrees == thirdCity.degrees || secondCity.degrees == thirdCity.degrees) {
        println("neither")
    }

}