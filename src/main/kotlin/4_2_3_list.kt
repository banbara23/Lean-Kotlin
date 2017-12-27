fun main(args: Array<String>) {
    //ミュータブルなリストはMutableListインタフェース
    val chars: MutableList<Char> = mutableListOf('a', 'b')
    println(chars) // => [a, b]
    //更新
    chars[0] = 'c'
    println(chars) // => [c, b]
    //追加
    chars += 'x'
    println(chars) // => [c, b, x]
    //削除
    chars -= 'x'
    println(chars) // => [c, b]
    chars.removeAt(0)
    println(chars) // => [b]

    //セット
    // イミュータブル
    val ints: Set<Int> = setOf(1, 2, 1, 3)
    println(ints) //=> [1, 2, 3]
    // ミュータブル
}