/**
 * Created by garyNoh on 2017. 7. 20..
 */


// #1. first function
fun getBiggerOne(a : Int, b : Int) : Int{
    if (a > b) return a
    else return b
}

// #2. easy function getBiggerOne
/*
이것을 type inference 라고 부른다
Kotlin 은 statically typed language 이기 때문에 컴파일러가 사전에
body expression 에서 계산된 값이 어떤 타입인지 분석해서 알아낼 수 있다
그렇기 때문에 굳이 return 값을 쓰지 않아도 된다.
긴 expression 은 가독성을 생각해서 굳이 이렇게 안써도 되겠는데 ? (책에서도 말하는 부분)

주의 : body 가 expression 인 애들만 가능
 */
fun easyGetBiggerOne(a : Int, b : Int) = if (a > b) a else b

/*
  #4. mutable and immutable variable test
* immutable 을 바꾸기를 시도했지만 컴파일에러가 발생한다
* 주의 : immutable 한 객체도 자신이 가리키는 객체는 mutable 할 수 있다
* val obj = arrayListOf("Java")
* obj.add("Kotlin")
* 같은 것은 유효하다는 말임
*
* 컴파일러는 var 의 경우도 처음에 초기화 되어있는 타입이 아닌 다른 타입이 들어오면 에러를 발생시킨다
* 초기화할때만 변수의 타입을 예상하는 것
* error : mismatch error
* */

fun doMutandImut(){
   val num = 2
    //불가능
    //num = 3
}

/*
 * #5. string template
 */

fun printString(str : String){
    println("This is a string ${str}")
}

/*
 * #6. class 선언
 * 사용할 때 큰 특징 2가지
 * 기본적인 기능을 하는 getter, setter 를 선언할 필요없다
 * constructor 필요없다
 */
class Person (var name : String)

/*
 * #7. custom accessor : getter setter 를 내가 설정하는 것
 *
 */
class Animal (val name : String, var age : Int){
    var isOld : Boolean = false
        get(){
            return age > 10
        }
}


fun main(args : Array<String>){
    // #1.
    println(getBiggerOne(1, 2 ))

    // #2.
    println(easyGetBiggerOne(2, 3))

    // #3. 변수 선언은 var 로 하면 compiler 가 알아서 해석해준다

    // #4. val 은 final 변수 var 는 variable 임, 각각을 immutable 과 mutable 로 칭한다.
    // \디폴트로 val 을 쓰는 것을 권장한다
    doMutandImut()

    // #5. string template : 변수에 string 을 넣을 수 있고 ${var_name} 으로 사용할 수 있다
    printString("hello kotlin")

    // #6. class 사용하기
    //getter 는 . 으로 접근할 수 있고 new keyword 가 필요없음
    val p = Person ("Gary Noh")
    println(p.name)
    p.name = "Gary Noh changed"
    println(p.name)
    val animal = Animal("Lion", 12)
    println(animal.age)
    println(animal.isOld)

}
