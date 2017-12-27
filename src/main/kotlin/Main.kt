fun main(args: Array<String>) {

    var person = Person("taro", "neet", 18, 199)
    println(person.toString())

    hello(null)
}

fun hello(name: String?) {
    // エルビス演算子
    name ?: "taro"
    println("hello kotlin '$name")

    var a =1
    val b = 1
    println(a === b)

    val stA = "test"
    val stB = "test"
    println(stA === stB)

}