package com.example.hellokity

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hellokity.databinding.ActivityMainBinding
import com.google.android.material.circularreveal.CircularRevealHelper.Strategy

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onResume() {
        super.onResume()
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }

    /*override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100){

        }
    }*/

    fun playTwo(view: View) {
        val secondIntent = Intent(this, SecondActivity::class.java)

        val arrA: Array<String>
        val arrB: Array<String>
        val countA: Int
        val countB: Int
        if (!isFieldEmpty()){
            val StrA = binding.StrategyA.text.toString()
            arrA = getStrategy(StrA)
            countA = arrA.size
            val StrB = binding.StrategyB.text.toString()
            arrB = getStrategy(StrB)
            countB = arrB.size


            secondIntent.putExtra("count_s_a", countA)
            secondIntent.putExtra("count_s_b", countB)
            secondIntent.putExtra("arr_s_a", arrA)
            secondIntent.putExtra("arr_s_b", arrB)

            //startActivityForResult(secondIntent, 100)
            startActivity(secondIntent)
        }
    }


    fun playOne(view: View) {
        val randIntent = Intent(this, RandomActivity::class.java)
        val arrA: Array<String>
        val arrB: Array<String>
        val countA: Int
        val countB: Int
        if (!isFieldEmpty()) {
            val StrA = binding.StrategyA.text.toString()
            arrA = getStrategy(StrA)
            countA = arrA.size
            val StrB = binding.StrategyB.text.toString()
            arrB = getStrategy(StrB)
            countB = arrB.size
            randIntent.putExtra("count_s_a", countA)
            randIntent.putExtra("count_s_b", countB)
            randIntent.putExtra("arr_s_a", arrA)
            randIntent.putExtra("arr_s_b", arrB)
            startActivity(randIntent)
        }
    }

    private fun isFieldEmpty(): Boolean {
        binding.apply {
            if (StrategyA.text.isNullOrEmpty()) StrategyA.error = "Поле должно быть заполненyо"
            if (StrategyB.text.isNullOrEmpty()) StrategyA.error = "Поле должно быть заполнено"
            return StrategyA.text.isNullOrEmpty() || StrategyB.text.isNullOrEmpty()
        }
    }

    private fun getStrategy(Str : String): Array<String> { //разбить строку на подстроки с разделителем ,
            val delim = ","
            val arr = Str.split(delim).toTypedArray()
            return arr


    }
}