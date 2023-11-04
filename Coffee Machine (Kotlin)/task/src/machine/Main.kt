package machine

var amountOfWater: Int = 400
var amountOfMilk: Int = 540
var amountOfCoffeeBeans: Int = 120
var noOfDisposableCups: Int = 9
var amountOfMoney: Int = 550
var loopOut: Boolean = true

fun buy() {
    println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    val optionNo = readln()

    when (optionNo) {
        "1" -> {
            if (resourceCheck(1)) {
                amountOfWater -= 250
                amountOfCoffeeBeans -= 16
                amountOfMoney += 4
                noOfDisposableCups -= 1
            }
        }

        "2" -> {
            if (resourceCheck(2)) {
                amountOfWater -= 350
                amountOfMilk -= 75
                amountOfCoffeeBeans -= 20
                amountOfMoney += 7
                noOfDisposableCups -= 1
            }
        }

        "3" -> {
            if (resourceCheck(3)) {
                amountOfWater -= 200
                amountOfMilk -= 100
                amountOfCoffeeBeans -= 12
                amountOfMoney += 6
                noOfDisposableCups -= 1
            }
        }
        "back" -> loop()
        else -> {}
    }
}

fun fill() {
    println("Write how many ml of water you want to add:")
    amountOfWater += readln().toInt()
    println("Write how many ml of milk you want to add:")
    amountOfMilk += readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    amountOfCoffeeBeans += readln().toInt()
    println("Write how many disposable cups you want to add:")
    noOfDisposableCups += readln().toInt()
}

fun take() {
    println("I gave you $$amountOfMoney")
    amountOfMoney = 0
}

fun remaining() {
    println(
        """
        |
        |The coffee machine has:
        |$amountOfWater ml of water
        |$amountOfMilk ml of milk
        |$amountOfCoffeeBeans g of coffee beans
        |$noOfDisposableCups disposable cups
        |$$amountOfMoney of money
        |
    """.trimMargin()
    )
}

fun exit() {
    loopOut = false
}

fun resourceCheck(optionNo: Int): Boolean {
    when (optionNo) {
        1 -> {
            val numberOfCups = 1
            var amountOfCoffee: Int
            var missingElement: String
            if (250 * numberOfCups > amountOfWater || 16 * numberOfCups > amountOfCoffeeBeans) {
                if (amountOfWater / 250.0 < amountOfCoffeeBeans / 16.0) {
                    amountOfCoffee = amountOfWater / 250
                    missingElement = "water"
                } else {
                    amountOfCoffee = amountOfCoffeeBeans / 16
                    missingElement = "coffee beans"
                }
                println("Sorry, not enough $missingElement.")
                return false
            }


            if (250 * numberOfCups <= amountOfWater && 16 * numberOfCups <= amountOfCoffeeBeans) {
                if (amountOfWater / 250.0 < amountOfCoffeeBeans / 16.0) {
                    amountOfCoffee = amountOfWater / 250
                } else {
                    amountOfCoffee = amountOfCoffeeBeans / 16
                }
                println("I have enough resources, making you a coffee!")
                return true
            }
        }

        2 -> {
            val numberOfCups = 1
            var amountOfCoffee: Int
            var missingElement: String
            if (350 * numberOfCups > amountOfWater || 75 * numberOfCups > amountOfMilk || 20 * numberOfCups > amountOfCoffeeBeans) {
                if (amountOfWater / 350.0 < amountOfMilk / 75.0 && amountOfWater / 350.0 < amountOfCoffeeBeans / 20.0) {
                    amountOfCoffee = amountOfWater / 350
                    missingElement = "water"
                } else if (amountOfMilk / 75.0 < amountOfWater / 350.0 && amountOfMilk / 75.0 < amountOfCoffeeBeans / 20.0) {
                    amountOfCoffee = amountOfMilk / 75
                    missingElement = "milk"
                } else {
                    amountOfCoffee = amountOfCoffeeBeans / 20
                    missingElement = "coffee beans"
                }
                println("Sorry, not enough $missingElement.")
                return false
            }


            if (350 * numberOfCups <= amountOfWater && 75 * numberOfCups <= amountOfMilk && 20 * numberOfCups <= amountOfCoffeeBeans) {
                if (amountOfWater / 350.0 < amountOfMilk / 75.0 && amountOfWater / 350.0 < amountOfCoffeeBeans / 20.0) {
                    amountOfCoffee = amountOfWater / 350
                } else if (amountOfMilk / 75.0 < amountOfWater / 350.0 && amountOfMilk / 75.0 < amountOfCoffeeBeans / 20.0) {
                    amountOfCoffee = amountOfMilk / 75
                } else {
                    amountOfCoffee = amountOfCoffeeBeans / 20
                }
                println("I have enough resources, making you a coffee!")
                return true
            }
        }

        3 -> {
            val numberOfCups = 1
            var amountOfCoffee: Int
            var missingElement: String
            if (200 * numberOfCups > amountOfWater || 100 * numberOfCups > amountOfMilk || 12 * numberOfCups > amountOfCoffeeBeans) {
                if (amountOfWater / 200.0 < amountOfMilk / 100.0 && amountOfWater / 200.0 < amountOfCoffeeBeans / 12.0) {
                    amountOfCoffee = amountOfWater / 200
                    missingElement = "water"
                } else if (amountOfMilk / 100.0 < amountOfWater / 200.0 && amountOfMilk / 100.0 < amountOfCoffeeBeans / 12.0) {
                    amountOfCoffee = amountOfMilk / 100
                    missingElement = "milk"
                } else {
                    amountOfCoffee = amountOfCoffeeBeans / 12
                    missingElement = "coffee beans"
                }
                println("Sorry, not enough $missingElement.")
                return false
            }


            if (200 * numberOfCups <= amountOfWater && 100 * numberOfCups <= amountOfMilk && 12 * numberOfCups <= amountOfCoffeeBeans) {
                if (amountOfWater / 200.0 < amountOfMilk / 100.0 && amountOfWater / 200.0 < amountOfCoffeeBeans / 12.0) {
                    amountOfCoffee = amountOfWater / 200
                } else if (amountOfMilk / 100.0 < amountOfWater / 200.0 && amountOfMilk / 100.0 < amountOfCoffeeBeans / 12.0) {
                    amountOfCoffee = amountOfMilk / 100
                } else {
                    amountOfCoffee = amountOfCoffeeBeans / 12
                }
                println("I have enough resources, making you a coffee!")
                return true
            }
        }
        else -> return false
    }
    return false
}

fun loop () {
    while (loopOut) {
        println("\nWrite action (buy, fill, take, remaining, exit):")
        val option = readln()

        when (option) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> remaining()
            "exit" -> exit()
        }
    }
}

class CoffeeMachine () {

}

fun main() {
    loop()



//
//    println("Write how many ml of water the coffee machine has:")
//    val amountOfWater = readln().toInt()
//    println("Write how many ml of milk the coffee machine has:")
//    val amountOfMilk = readln().toInt()
//    println("Write how many grams of coffee beans the coffee machine has:")
//    val amountOfCoffeeBeans = readln().toInt()
//
//    println("Write how many cups of coffee you will need:")
//    val numberOfCups = readln().toInt()
//    var amountOfCoffee: Int
//    if (200 * numberOfCups > amountOfWater || 50 * numberOfCups > amountOfMilk || 15 * numberOfCups > amountOfCoffeeBeans) {
//        if (amountOfWater / 200.0 < amountOfMilk / 50.0 && amountOfWater / 200.0 < amountOfCoffeeBeans / 15.0) {
//            amountOfCoffee = amountOfWater / 200
//        } else if (amountOfMilk / 50.0 < amountOfWater / 200.0 && amountOfMilk / 50.0 < amountOfCoffeeBeans / 15.0) {
//            amountOfCoffee = amountOfMilk / 50
//        } else {
//            amountOfCoffee = amountOfCoffeeBeans / 15
//        }
//        println("No, I can make only $amountOfCoffee cups of coffee")
//    }
//
//
//    if (200 * numberOfCups <= amountOfWater && 50 * numberOfCups <= amountOfMilk && 15 * numberOfCups <= amountOfCoffeeBeans) {
//        if (amountOfWater / 200.0 < amountOfMilk / 50.0 && amountOfWater / 200.0 < amountOfCoffeeBeans / 15.0) {
//            amountOfCoffee = amountOfWater / 200
//        } else if (amountOfMilk / 50.0 < amountOfWater / 200.0 && amountOfMilk / 50.0 < amountOfCoffeeBeans / 15.0) {
//            amountOfCoffee = amountOfMilk / 50
//        } else {
//            amountOfCoffee = amountOfCoffeeBeans / 15
//        }
//        if (amountOfCoffee == numberOfCups) {
//            println("Yes, I can make that amount of coffee")
//        } else {
//            println("Yes, I can make that amount of coffee (and even ${amountOfCoffee - numberOfCups} more than that)")
//        }
//    }
//
//
//    println("For $numberOfCups cups of coffee you will need:")
//    println("${200 * numberOfCups} ml of water")
//    println("${50 * numberOfCups} ml of milk")
//    println("${15 * numberOfCups} g of coffee beans")
//
//    println("Starting to make a coffee")
//    println("Grinding coffee beans")
//    println("Boiling water")
//    println("Mixing boiled water with crushed coffee beans")
//    println("Pouring coffee into the cup")
//    println("Pouring some milk into the cup")
//    println("Coffee is ready!")
}
