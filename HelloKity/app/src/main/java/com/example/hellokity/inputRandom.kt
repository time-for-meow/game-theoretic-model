package com.example.hellokity

import android.text.Editable
import android.view.View
import com.example.hellokity.databinding.ActivityRandomBinding
import com.example.hellokity.databinding.ActivitySecondBinding

object inputRandom {
    //зарандомить матрицу для активити TwoMatrix
    fun inputtable2(countA : Int, countB: Int, arrA: Array<String>, arrB: Array<String>, bindingClass: ActivitySecondBinding ) {
        val start = -100
        val end = 100
    when (countA) {
        1 -> {
            when (countB) {
                2 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                3 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
                4 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                else -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn15.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
            }
        }
        2 -> {
            when (countB) {
                1 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                2 -> {
                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                3 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())


                }
                4 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                else -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn15.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn25.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
            }
        }
        3 -> {
            when (countB) {
                1 -> {


                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
                2 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
                3 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
                4 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn34.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                else -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn15.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn25.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn34.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn35.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
            }
        }
        4 -> {
            when (countB) {
                1 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
                2 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())


                }
                3 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn43.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                4 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn34.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn43.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn44.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                else -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn15.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn25.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn34.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn35.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn43.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn44.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn45.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
            }

        }
        else -> {
            when (countB) {
                1 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn51.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                2 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn51.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn52.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                3 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn43.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn51.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn52.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn53.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                4 -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn34.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn43.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn44.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn51.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn52.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn53.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn54.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())

                }
                else -> {

                    bindingClass.etn11.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn12.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn13.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn14.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn15.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn21.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn22.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn23.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn24.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn25.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn31.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn32.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn33.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn34.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn35.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn41.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn42.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn43.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn44.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn45.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn51.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn52.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn53.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn54.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                    bindingClass.etn55.text = Editable.Factory.getInstance()
                        .newEditable((start..end).random().toString() + ";" + (start..end).random().toString())
                }
            }
        }
    }
    }

    // зарандомить матрицу для активити OneMatrix
    fun inputtable1(countA : Int, countB: Int, arrA: Array<String>, arrB: Array<String>, bindingClass: ActivityRandomBinding) {
        val start = -100
        val end = 100
        when (countA) {
            1 -> {
                when (countB) {
                    2 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    3 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                    4 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    else -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn15.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                }
            }
            2 -> {
                when (countB) {
                    1 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    2 -> {
                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    3 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())


                    }
                    4 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    else -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn15.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn25.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                }
            }
            3 -> {
                when (countB) {
                    1 -> {


                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                    2 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                    3 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                    4 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn34.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    else -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn15.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn25.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn34.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn35.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                }
            }
            4 -> {
                when (countB) {
                    1 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                    2 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())


                    }
                    3 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn43.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    4 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn34.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn43.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn44.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    else -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn15.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn25.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn34.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn35.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn43.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn44.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn45.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                }

            }
            else -> {
                when (countB) {
                    1 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn51.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    2 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn51.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn52.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    3 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn43.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn51.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn52.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn53.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    4 -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn34.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn43.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn44.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn51.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn52.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn53.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn54.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())

                    }
                    else -> {

                        bindingClass.etn11.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn12.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn13.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn14.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn15.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn21.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn22.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn23.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn24.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn25.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn31.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn32.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn33.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn34.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn35.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn41.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn42.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn43.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn44.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn45.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn51.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn52.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn53.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn54.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                        bindingClass.etn55.text = Editable.Factory.getInstance()
                            .newEditable((start..end).random().toString())
                    }
                }
            }
        }
    }


    //показать пустую табличку для активити TwoMatrix
    fun inputClearTable2(countA : Int, countB: Int, arrA: Array<String>, arrB: Array<String>, bindingClass: ActivitySecondBinding ) {
        when (countA) {
            1 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    2 -> {
                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE

                    }
                    3 -> {
                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE


                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        }
                    4 -> {
                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE

                    }
                    else -> {

                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                    }
                }
            }
            2 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE



                    }
                    2 -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE


                    }
                    3 -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE




                    }
                    4 -> {

                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE

                    }
                    else -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE

                    }
                }
            }
            3 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.str3.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn32.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE


                    }
                    2 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE

              }
                    3 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE

                         }
                    4 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE

                    }
                    else -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(3)).toString()
                        bindingClass.tvA3.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn35.visibility = View.VISIBLE


                    }
                }
            }
            4 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.str3.visibility = View.VISIBLE
                bindingClass.str4.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn32.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn42.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA3.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE


                    }
                    2 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE


                    }
                    3 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE


                    }
                    4 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE


                    }
                    else -> {
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn35.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE
                        bindingClass.etn45.visibility = View.VISIBLE

                    }
                }

            }
            else -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.str3.visibility = View.VISIBLE
                bindingClass.str4.visibility = View.VISIBLE
                bindingClass.str5.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn32.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn42.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn52.visibility = View.GONE
                        bindingClass.etn53.visibility = View.GONE
                        bindingClass.etn54.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE


                    }
                    2 -> {
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn53.visibility = View.GONE
                        bindingClass.etn54.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE


                    }
                    3 -> {
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn54.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE
                        bindingClass.etn53.visibility = View.VISIBLE

                    }
                    4 -> {
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE
                        bindingClass.etn53.visibility = View.VISIBLE
                        bindingClass.etn54.visibility = View.VISIBLE


                    }
                    else -> {
                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(3)).toString()
                        bindingClass.tvA3.text = (arrA?.get(3)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn35.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE
                        bindingClass.etn45.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE
                        bindingClass.etn53.visibility = View.VISIBLE
                        bindingClass.etn54.visibility = View.VISIBLE
                        bindingClass.etn55.visibility = View.VISIBLE

                    }
                }
            }
        }
    }


//показать пустую табличку для активити OneMatrix
    fun inputClearTable1(countA : Int, countB: Int, arrA: Array<String>, arrB: Array<String>, bindingClass: ActivityRandomBinding) {
        when (countA) {
            1 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    2 -> {
                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE

                    }
                    3 -> {
                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE


                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                    }
                    4 -> {
                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE

                    }
                    else -> {

                        bindingClass.str2.visibility = View.GONE
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                    }
                }
            }
            2 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE



                    }
                    2 -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE


                    }
                    3 -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE




                    }
                    4 -> {

                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE

                    }
                    else -> {
                        bindingClass.str3.visibility = View.GONE
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE

                    }
                }
            }
            3 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.str3.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn32.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE


                    }
                    2 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE

                    }
                    3 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE

                    }
                    4 -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE

                    }
                    else -> {
                        bindingClass.str4.visibility = View.GONE
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(3)).toString()
                        bindingClass.tvA3.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn35.visibility = View.VISIBLE


                    }
                }
            }
            4 -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.str3.visibility = View.VISIBLE
                bindingClass.str4.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn32.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn42.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA3.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE


                    }
                    2 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE


                    }
                    3 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE


                    }
                    4 -> {
                        bindingClass.str5.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE


                    }
                    else -> {
                        bindingClass.str5.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn35.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE
                        bindingClass.etn45.visibility = View.VISIBLE

                    }
                }

            }
            else -> {
                bindingClass.str1.visibility = View.VISIBLE
                bindingClass.str2.visibility = View.VISIBLE
                bindingClass.str3.visibility = View.VISIBLE
                bindingClass.str4.visibility = View.VISIBLE
                bindingClass.str5.visibility = View.VISIBLE
                bindingClass.lineStrategyB.visibility = View.VISIBLE
                when (countB) {
                    1 -> {
                        bindingClass.etn12.visibility = View.GONE
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn22.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn32.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn42.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn52.visibility = View.GONE
                        bindingClass.etn53.visibility = View.GONE
                        bindingClass.etn54.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.visibility = View.GONE
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE


                    }
                    2 -> {
                        bindingClass.etn13.visibility = View.GONE
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn23.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn33.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn43.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn53.visibility = View.GONE
                        bindingClass.etn54.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.visibility = View.GONE
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE


                    }
                    3 -> {
                        bindingClass.etn14.visibility = View.GONE
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn24.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn34.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn44.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn54.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.visibility = View.GONE
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE
                        bindingClass.etn53.visibility = View.VISIBLE

                    }
                    4 -> {
                        bindingClass.etn15.visibility = View.GONE
                        bindingClass.etn25.visibility = View.GONE
                        bindingClass.etn35.visibility = View.GONE
                        bindingClass.etn45.visibility = View.GONE
                        bindingClass.etn55.visibility = View.GONE

                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(1)).toString()
                        bindingClass.tvA3.text = (arrA?.get(2)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.visibility = View.GONE

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE
                        bindingClass.etn53.visibility = View.VISIBLE
                        bindingClass.etn54.visibility = View.VISIBLE


                    }
                    else -> {
                        bindingClass.tvA1.text = (arrA?.get(0)).toString()
                        bindingClass.tvA2.text = (arrA?.get(3)).toString()
                        bindingClass.tvA3.text = (arrA?.get(3)).toString()
                        bindingClass.tvA4.text = (arrA?.get(3)).toString()
                        bindingClass.tvA5.text = (arrA?.get(4)).toString()
                        bindingClass.tvB1.text = (arrB?.get(0)).toString()
                        bindingClass.tvB2.text = (arrB?.get(1)).toString()
                        bindingClass.tvB3.text = (arrB?.get(2)).toString()
                        bindingClass.tvB4.text = (arrB?.get(3)).toString()
                        bindingClass.tvB5.text = (arrB?.get(4)).toString()

                        bindingClass.tvA1.visibility = View.VISIBLE
                        bindingClass.tvA2.visibility = View.VISIBLE
                        bindingClass.tvA3.visibility = View.VISIBLE
                        bindingClass.tvA4.visibility = View.VISIBLE
                        bindingClass.tvA5.visibility = View.VISIBLE
                        bindingClass.tvB1.visibility = View.VISIBLE
                        bindingClass.tvB2.visibility = View.VISIBLE
                        bindingClass.tvB3.visibility = View.VISIBLE
                        bindingClass.tvB4.visibility = View.VISIBLE
                        bindingClass.tvB5.visibility = View.VISIBLE
                        bindingClass.etn11.visibility = View.VISIBLE
                        bindingClass.etn12.visibility = View.VISIBLE
                        bindingClass.etn13.visibility = View.VISIBLE
                        bindingClass.etn14.visibility = View.VISIBLE
                        bindingClass.etn15.visibility = View.VISIBLE
                        bindingClass.etn21.visibility = View.VISIBLE
                        bindingClass.etn22.visibility = View.VISIBLE
                        bindingClass.etn23.visibility = View.VISIBLE
                        bindingClass.etn24.visibility = View.VISIBLE
                        bindingClass.etn25.visibility = View.VISIBLE
                        bindingClass.etn31.visibility = View.VISIBLE
                        bindingClass.etn32.visibility = View.VISIBLE
                        bindingClass.etn33.visibility = View.VISIBLE
                        bindingClass.etn34.visibility = View.VISIBLE
                        bindingClass.etn35.visibility = View.VISIBLE
                        bindingClass.etn41.visibility = View.VISIBLE
                        bindingClass.etn42.visibility = View.VISIBLE
                        bindingClass.etn43.visibility = View.VISIBLE
                        bindingClass.etn44.visibility = View.VISIBLE
                        bindingClass.etn45.visibility = View.VISIBLE
                        bindingClass.etn51.visibility = View.VISIBLE
                        bindingClass.etn52.visibility = View.VISIBLE
                        bindingClass.etn53.visibility = View.VISIBLE
                        bindingClass.etn54.visibility = View.VISIBLE
                        bindingClass.etn55.visibility = View.VISIBLE

                    }
                }
            }
        }
    }
}