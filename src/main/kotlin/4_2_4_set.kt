fun main(args: Array<String>) {

    //セット
    // イミュータブル
    val ints: Set<Int> = setOf(1, 2, 1, 3)
    println(ints) //=> [1, 2, 3]
    // ミュータブル
    val chars: MutableSet<Char> = mutableSetOf('a', 'a', 'b')
    println(chars) //=>[a, b]
    // 削除
    chars -= 'a'
    println(chars) //=>[b]
}