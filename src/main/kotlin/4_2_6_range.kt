fun main(args: Array<String>) {
    //レンジ
    //5は1〜10に含まれているか？
    println(5 in 1..10) //=> true

    val range: IntRange = 12..15
    println(5 in range) //=> false

    // !inは否定
    println(5 !in range) //=> true

    //toListでリストオブジェクトに変換できる
    println((1..5).toList()) //=> [1, 2, 3, 4, 5]

    //reversedで逆レンジ
    println((1..5).reversed().toList()) //=> [5, 4, 3, 2, 1]
    //もっと簡潔にするには downTo
    println((5 downTo 1).toList()) //=> [5, 4, 3, 2, 1]
    //stepで増減の間隔を調整できる
    println((1..5 step 2).toList()) //=> [1, 3, 5]
    println((100 downTo 0 step 25).toList()) //=> [100, 75, 50, 25, 0]

}