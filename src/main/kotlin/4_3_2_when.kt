fun main(args: Array<String>) {
    //when式はJavaにおけるswitchを協力にしたようなもの

    //単純な使い方
    val x = 1
    var message = when (x) {
        1 -> "one"
        2, 3 -> "two or three"
        else -> {
            "unknown"
        }
    }
    println(message) //=> one

    //様々な条件で分岐が可能
    val y = 20
    message = when (y) {
        1 -> "one"
        myFavoriteInt() -> "favorite: $y"
        in 2..10 -> "1 <= x <= 10"
        else -> y.toString()
    }
    println(message) //=> favorite: 20

    //isを用いて型チェックで分岐
    val str = "hello"
    val blank = when (str) {
        is String -> str.isBlank()
        else -> true
    }
    println(blank) //=> false

    //ifのチェーンに置き換えると見やすい
    val score = 50
    when {
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else        -> 'F'
    }
}

fun myFavoriteInt(): Any {
    return 20
}
