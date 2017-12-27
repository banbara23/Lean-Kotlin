fun main(args: Array<String>) {
    //マップ
    //イミュータブル
    val numberMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "tow" to 2)
    println(numberMap) //=> {one=1, tow=2}
    //サイズ
    println(numberMap.size) //=> 2
    //Keyを指定してValueを取得
    println(numberMap["one"]) //=> 1
    //存在しないKeyを指定
    println(numberMap["three"]) //=> null
    //追加はPairを足す
    numberMap += "three" to 3
    println(numberMap) //=> {one=1, tow=2, three=3}



}