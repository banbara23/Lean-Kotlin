fun main(args: Array<String>) {
    //while
    var count = 3
    while (count-- > 0) {
        println("Hello")
    }
    //->Hello
    //->Hello
    //->Hello

    //do-while
    do {
        println("Hello")
        val next = Math.random() < 0.5  //変数nextをwhileの条件に指定できる
    } while (next)

    //->Hello
    //...


    //for
    for (x in arrayOf(1, 2, 3)) {
        println(x)
    }
    //-> 1
    //-> 2
    //-> 3

    val names = listOf("foo", "bar", "baz")
    for (name in names) {
        println(name)
    }
    //-> foo
    //-> bar
    //-> baz

    for (i in 1..10 step 2) {
        println(i)
    }
    //-> 1
    //-> 3
    //-> 5
    //-> 7
    //-> 9

    //break
    //indicesはリストや配列に定義されているプロパティで、全要素分のインデックスをレンジとして返す
    var barIndex = -1
    //barが最初に登場するインデックスを取得する
    for (index in names.indices) {
        println(index) //-> 0,1,2などのインデックス
        if (names[index] == "bar") {
            barIndex = index
            break   //barが見つかったらループを抜ける
        }
    }
    println(barIndex) //-> 1

    //ラベル付きのジャンプ
    loop@ for (x in 1..10) {
        for (y in 1..10) {
            if (y == 5) {
                break@loop
            }
        }
    }
}