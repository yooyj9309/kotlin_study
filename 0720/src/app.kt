/**
 * Created by garyNoh on 2017. 7. 20..
 */


//first function
fun getBiggerOne(a : Int, b : Int) : Int{
    if (a > b) return a
    else return b
}

//easy function getBiggerOne
fun easyGetBiggerOne(a : Int, b : Int) = if (a > b) a else b

fun main(args : Array<String>){
    // #1.
    println(getBiggerOne(1, 2 ))
    // #2.
    println(easyGetBiggerOne(2, 3))
}
