package jp.techacademy.genki.kosaka.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("たろう", 20, "山")
        val human2 = Human("じろう", 10, "川")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}
