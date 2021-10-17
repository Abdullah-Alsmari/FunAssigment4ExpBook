import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    // val numLetters = "Mississippi".count()
    // print(numLetters)

    val numLetters = "Mississippi".count({ letter -> letter == 's' })
    println(numLetters)

/*
 println(
    { val currentYear = 2018
    ("Welcome to SimVillage, Mayor! (copyright $currentYear)")
      }() )
                (Finsh 1 ) */


    /*
       val  greetingFunction: ()->String = {
       val currentYear =2018
       "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }
     println(greetingFunction())
                ( Finsh 2 )*/

/*
    val greentingFunction:(String)-> = { PlayerName ->
    val currentYear = 2018
    "Welcome to SimVillage, $PlayerName! (copyright $currentYear)"
    }
        // println(greetingFunction("Abdullah"))
           //  ( I HAVE QUS + ERORR )  */


    /*
     val greetingFunction: (String,Int) -> Unit={ playerName,numBuildings ->
     val currentYear = 2018
      println("Adding $numBuildings houses")
      println( "Welcome to SimVillage, $playerName! (copyright $currentYear)")

        println(greetingFunction("ABDULLAH",25))

                  Finsh 3  */

    fun runSimulation() {
        val greetingFunction = configureGreetingFunction()
        println(greetingFunction("Abdullah"))
     }

    fun configureGreetingFunction(): (String) -> String {
        val structureType = "hospitals"
        var numBuildings = 5
         return { playerName: String -> val currentYear = 2018
            numBuildings += 1
            println("Adding $numBuildings $structureType")
            "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        }
    }

    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        runSimulation("Abdullah", greetingFunction)

    }

    fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
        val numBuildings = Random.nextInt(1..3)
        println(greetingFunction(playerName, numBuildings))
    }

    fun printConstructionCost(numBuildings: Int) {
        val cost = 500
        println("construction cost: ${cost * numBuildings}")
    }
}




