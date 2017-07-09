/**
 * Created by Yazdani on 7/9/2017.
 */

fun main(args : Array<String>){


    var a="Orange"

    when(a){

        "Red" ->
                println("Value is Red")

        "Yellow" ->
                println("Value is Yellow")

        "Orange" ->
                println("Value is Orange")

        else ->
                println("Value is not match")
    }

    var i=25

    when(i){

        in 1..100 -> println("Answer is between 1 to 100")

        in 2..266 -> println("Answer is between 2 to 266")

        else -> println("Value is not match")
    }

}