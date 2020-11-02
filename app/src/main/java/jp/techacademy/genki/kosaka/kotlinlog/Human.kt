package jp.techacademy.genki.kosaka.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {


    /*
    var hobby: String
    init{
        hobby = "あああ"
    }*/

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby:String): super(name, age, hobby) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Movableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

}