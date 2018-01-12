fun main(args: Array<String>) {
    var score = 50
    if (score >= 60) {
        println("合格")
    } else {
        println("不合格")
    }
    //=> 不合格

    //上の式はこう書く事もできる
    val messsage = if (score >= 60) "合格" else "不合格"
    println(messsage) //=> 不合格

    // 5は1〜10の中に含まれるか？
    if (5 in 1..10) {
        println("wawa") //=> wawa
    }

    //ブロックを取る場合はそのブロック内で最後に評価される式が返される
    val x = if (true) {
        1
        2
    } else {
        3
    }
    println(x) //=> 2

    // 条件分岐のチェーンを形成することもできる
    score = 75
    val grade =
            if (score >= 90) 'A'
            else if (score >= 80) 'B'
            else if (score >= 70) 'C'
            else if (score >= 60) 'D'
            else 'F'
    println(grade) //=> C
}