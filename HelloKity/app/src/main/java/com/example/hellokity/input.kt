package com.example.hellokity

import android.text.Editable
import android.view.View
import com.example.hellokity.databinding.ActivityRandomBinding
import com.example.hellokity.databinding.ActivitySecondBinding

object input {

    fun inputtable2(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, countA : Int, countB: Int, arrA: Array<String>, arrB: Array<String>, bindingClass: ActivitySecondBinding): MutableList<MutableList<Pair<Int, Int>>>{
        var strPair  : String = ""
        when (countA) {
            1 -> {
                when (countB) {
                    2 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                    }
                    3 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                    }
                    4 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                    }
                    else -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn15.text.toString()
                        root_matrix[0][4] = getStrategy(strPair)
                    }
                }
            }
            2 -> {
                when (countB) {
                    1 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                    }
                    2 -> {


                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                    }
                    3 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)

                    }
                    4 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                    }
                    else -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn15.text.toString()
                        root_matrix[0][4] = getStrategy(strPair)
                        strPair = bindingClass.etn25.text.toString()
                        root_matrix[1][4] = getStrategy(strPair)
                    }
                }
            }
            3 -> {
                when (countB) {
                    1 -> {


                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                    }
                    2 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                    }
                    3 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                    }
                    4 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn34.text.toString()
                        root_matrix[2][3] = getStrategy(strPair)
                    }
                    else -> {


                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn34.text.toString()
                        root_matrix[2][3] = getStrategy(strPair)
                        strPair = bindingClass.etn15.text.toString()
                        root_matrix[0][4] = getStrategy(strPair)
                        strPair = bindingClass.etn25.text.toString()
                        root_matrix[1][4] = getStrategy(strPair)
                        strPair = bindingClass.etn35.text.toString()
                        root_matrix[2][4] = getStrategy(strPair)

                    }
                }
            }
            4 -> {
                when (countB) {
                    1 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                    }
                    2 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)

                    }
                    3 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn43.text.toString()
                        root_matrix[3][2] = getStrategy(strPair)
                    }
                    4 -> {

                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn43.text.toString()
                        root_matrix[3][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn34.text.toString()
                        root_matrix[2][3] = getStrategy(strPair)
                        strPair = bindingClass.etn44.text.toString()
                        root_matrix[3][3] = getStrategy(strPair)
                    }
                    else -> {


                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn43.text.toString()
                        root_matrix[3][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn34.text.toString()
                        root_matrix[2][3] = getStrategy(strPair)
                        strPair = bindingClass.etn44.text.toString()
                        root_matrix[3][3] = getStrategy(strPair)
                        strPair = bindingClass.etn15.text.toString()
                        root_matrix[0][4] = getStrategy(strPair)
                        strPair = bindingClass.etn25.text.toString()
                        root_matrix[1][4] = getStrategy(strPair)
                        strPair = bindingClass.etn35.text.toString()
                        root_matrix[2][4] = getStrategy(strPair)
                        strPair = bindingClass.etn45.text.toString()
                        root_matrix[3][4] = getStrategy(strPair)
                    }
                }

            }
            else -> {
                when (countB) {
                    1 -> {
                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn51.text.toString()
                        root_matrix[4][0] = getStrategy(strPair)
                    }
                    2 -> {
                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn51.text.toString()
                        root_matrix[4][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn52.text.toString()
                        root_matrix[4][1] = getStrategy(strPair)
                    }
                    3 -> {
                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn51.text.toString()
                        root_matrix[4][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn52.text.toString()
                        root_matrix[4][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn43.text.toString()
                        root_matrix[3][2] = getStrategy(strPair)
                        strPair = bindingClass.etn53.text.toString()
                        root_matrix[4][2] = getStrategy(strPair)
                    }
                    4 -> {
                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn51.text.toString()
                        root_matrix[4][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn52.text.toString()
                        root_matrix[4][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn43.text.toString()
                        root_matrix[3][2] = getStrategy(strPair)
                        strPair = bindingClass.etn53.text.toString()
                        root_matrix[4][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn34.text.toString()
                        root_matrix[2][3] = getStrategy(strPair)
                        strPair = bindingClass.etn44.text.toString()
                        root_matrix[3][3] = getStrategy(strPair)
                        strPair = bindingClass.etn54.text.toString()
                        root_matrix[4][3] = getStrategy(strPair)
                    }
                    else -> {
                        strPair = bindingClass.etn11.text.toString()
                        root_matrix[0][0] = getStrategy(strPair)
                        strPair = bindingClass.etn21.text.toString()
                        root_matrix[1][0] = getStrategy(strPair)
                        strPair = bindingClass.etn31.text.toString()
                        root_matrix[2][0] = getStrategy(strPair)
                        strPair = bindingClass.etn41.text.toString()
                        root_matrix[3][0] = getStrategy(strPair)
                        strPair = bindingClass.etn51.text.toString()
                        root_matrix[4][0] = getStrategy(strPair)
                        strPair = bindingClass.etn12.text.toString()
                        root_matrix[0][1] = getStrategy(strPair)
                        strPair = bindingClass.etn22.text.toString()
                        root_matrix[1][1] = getStrategy(strPair)
                        strPair = bindingClass.etn32.text.toString()
                        root_matrix[2][1] = getStrategy(strPair)
                        strPair = bindingClass.etn42.text.toString()
                        root_matrix[3][1] = getStrategy(strPair)
                        strPair = bindingClass.etn52.text.toString()
                        root_matrix[4][1] = getStrategy(strPair)
                        strPair = bindingClass.etn13.text.toString()
                        root_matrix[0][2] = getStrategy(strPair)
                        strPair = bindingClass.etn23.text.toString()
                        root_matrix[1][2] = getStrategy(strPair)
                        strPair = bindingClass.etn33.text.toString()
                        root_matrix[2][2] = getStrategy(strPair)
                        strPair = bindingClass.etn43.text.toString()
                        root_matrix[3][2] = getStrategy(strPair)
                        strPair = bindingClass.etn53.text.toString()
                        root_matrix[4][2] = getStrategy(strPair)
                        strPair = bindingClass.etn14.text.toString()
                        root_matrix[0][3] = getStrategy(strPair)
                        strPair = bindingClass.etn24.text.toString()
                        root_matrix[1][3] = getStrategy(strPair)
                        strPair = bindingClass.etn34.text.toString()
                        root_matrix[2][3] = getStrategy(strPair)
                        strPair = bindingClass.etn44.text.toString()
                        root_matrix[3][3] = getStrategy(strPair)
                        strPair = bindingClass.etn54.text.toString()
                        root_matrix[4][3] = getStrategy(strPair)
                        strPair = bindingClass.etn15.text.toString()
                        root_matrix[0][4] = getStrategy(strPair)
                        strPair = bindingClass.etn25.text.toString()
                        root_matrix[1][4] = getStrategy(strPair)
                        strPair = bindingClass.etn35.text.toString()
                        root_matrix[2][4] = getStrategy(strPair)
                        strPair = bindingClass.etn45.text.toString()
                        root_matrix[3][4] = getStrategy(strPair)
                        strPair = bindingClass.etn55.text.toString()
                        root_matrix[4][4] = getStrategy(strPair)
                    }
                }
            }
        }
        return root_matrix
    }

    fun hideStrategy2(tempset1: MutableSet<Int>, tempset2: MutableSet<Int>, bindingClass: ActivitySecondBinding){
        for (elem in tempset1) { //str
            when (elem) {
                0 -> {
                    bindingClass.str1.visibility = View.GONE
                }
                1 -> {
                    bindingClass.str2.visibility = View.GONE
                }
                2 -> {
                    bindingClass.str3.visibility = View.GONE
                }
                3 -> {
                    bindingClass.str4.visibility = View.GONE
                }
                4 -> {
                    bindingClass.str5.visibility = View.GONE
                }
            }
        }

        for (elem in tempset2) { //str
            when (elem) {
                0 -> {
                    bindingClass.tvB1.visibility = View.GONE
                    bindingClass.etn51.visibility = View.GONE
                    bindingClass.etn41.visibility = View.GONE
                    bindingClass.etn31.visibility = View.GONE
                    bindingClass.etn21.visibility = View.GONE
                    bindingClass.etn11.visibility = View.GONE
                }
                1 -> {
                    bindingClass.tvB2.visibility = View.GONE
                    bindingClass.etn52.visibility = View.GONE
                    bindingClass.etn42.visibility = View.GONE
                    bindingClass.etn32.visibility = View.GONE
                    bindingClass.etn22.visibility = View.GONE
                    bindingClass.etn12.visibility = View.GONE
                }
                2 -> {
                    bindingClass.tvB3.visibility = View.GONE
                    bindingClass.etn53.visibility = View.GONE
                    bindingClass.etn43.visibility = View.GONE
                    bindingClass.etn33.visibility = View.GONE
                    bindingClass.etn23.visibility = View.GONE
                    bindingClass.etn13.visibility = View.GONE
                }
                3 -> {
                    bindingClass.tvB4.visibility = View.GONE
                    bindingClass.etn54.visibility = View.GONE
                    bindingClass.etn44.visibility = View.GONE
                    bindingClass.etn34.visibility = View.GONE
                    bindingClass.etn24.visibility = View.GONE
                    bindingClass.etn14.visibility = View.GONE
                }
                4 -> {
                    bindingClass.tvB5.visibility = View.GONE
                    bindingClass.etn55.visibility = View.GONE
                    bindingClass.etn45.visibility = View.GONE
                    bindingClass.etn35.visibility = View.GONE
                    bindingClass.etn25.visibility = View.GONE
                    bindingClass.etn15.visibility = View.GONE
                }
            }
        }

    }



    private fun getStrategy(Str : String): Pair<Int, Int> { //разбить строку на подстроки с разделителем ,
        val delim = ";"
        val arr = Str.split(delim).toTypedArray()
        var temppair = Pair(arr[0].toInt(),arr[1].toInt())
        return temppair

    }

    fun inputtable1(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, countA : Int, countB: Int, arrA: Array<String>, arrB: Array<String>, bindingClass: ActivityRandomBinding): MutableList<MutableList<Pair<Int, Int>>>{
        var elem = 0
        when (countA) {
            1 -> {
                when (countB) {
                    2 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                    }
                    3 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                    }
                    4 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                    }
                    else -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn15.text.toString().toInt()
                        root_matrix[0][4] = Pair(elem, -1*elem)
                    }
                }
            }
            2 -> {
                when (countB) {
                    1 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                    }
                    2 -> {


                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                    }
                    3 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)

                    }
                    4 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                    }
                    else -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn15.text.toString().toInt()
                        root_matrix[0][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn25.text.toString().toInt()
                        root_matrix[1][4] = Pair(elem, -1*elem)
                    }
                }
            }
            3 -> {
                when (countB) {
                    1 -> {


                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                    }
                    2 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                    }
                    3 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                    }
                    4 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn34.text.toString().toInt()
                        root_matrix[2][3] = Pair(elem, -1*elem)
                    }
                    else -> {


                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn34.text.toString().toInt()
                        root_matrix[2][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn15.text.toString().toInt()
                        root_matrix[0][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn25.text.toString().toInt()
                        root_matrix[1][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn35.text.toString().toInt()
                        root_matrix[2][4] = Pair(elem, -1*elem)

                    }
                }
            }
            4 -> {
                when (countB) {
                    1 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                    }
                    2 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)

                    }
                    3 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn43.text.toString().toInt()
                        root_matrix[3][2] = Pair(elem, -1*elem)
                    }
                    4 -> {

                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn43.text.toString().toInt()
                        root_matrix[3][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn34.text.toString().toInt()
                        root_matrix[2][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn44.text.toString().toInt()
                        root_matrix[3][3] = Pair(elem, -1*elem)
                    }
                    else -> {


                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn43.text.toString().toInt()
                        root_matrix[3][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn34.text.toString().toInt()
                        root_matrix[2][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn44.text.toString().toInt()
                        root_matrix[3][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn15.text.toString().toInt()
                        root_matrix[0][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn25.text.toString().toInt()
                        root_matrix[1][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn35.text.toString().toInt()
                        root_matrix[2][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn45.text.toString().toInt()
                        root_matrix[3][4] = Pair(elem, -1*elem)
                    }
                }

            }
            else -> {
                when (countB) {
                    1 -> {
                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn51.text.toString().toInt()
                        root_matrix[4][0] = Pair(elem, -1*elem)
                    }
                    2 -> {
                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn51.text.toString().toInt()
                        root_matrix[4][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn52.text.toString().toInt()
                        root_matrix[4][1] = Pair(elem, -1*elem)
                    }
                    3 -> {
                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn51.text.toString().toInt()
                        root_matrix[4][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn52.text.toString().toInt()
                        root_matrix[4][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn43.text.toString().toInt()
                        root_matrix[3][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn53.text.toString().toInt()
                        root_matrix[4][2] = Pair(elem, -1*elem)
                    }
                    4 -> {
                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn51.text.toString().toInt()
                        root_matrix[4][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn52.text.toString().toInt()
                        root_matrix[4][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn43.text.toString().toInt()
                        root_matrix[3][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn53.text.toString().toInt()
                        root_matrix[4][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn34.text.toString().toInt()
                        root_matrix[2][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn44.text.toString().toInt()
                        root_matrix[3][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn54.text.toString().toInt()
                        root_matrix[4][3] = Pair(elem, -1*elem)
                    }
                    else -> {
                        elem = bindingClass.etn11.text.toString().toInt()
                        root_matrix[0][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn21.text.toString().toInt()
                        root_matrix[1][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn31.text.toString().toInt()
                        root_matrix[2][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn41.text.toString().toInt()
                        root_matrix[3][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn51.text.toString().toInt()
                        root_matrix[4][0] = Pair(elem, -1*elem)
                        elem = bindingClass.etn12.text.toString().toInt()
                        root_matrix[0][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn22.text.toString().toInt()
                        root_matrix[1][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn32.text.toString().toInt()
                        root_matrix[2][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn42.text.toString().toInt()
                        root_matrix[3][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn52.text.toString().toInt()
                        root_matrix[4][1] = Pair(elem, -1*elem)
                        elem = bindingClass.etn13.text.toString().toInt()
                        root_matrix[0][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn23.text.toString().toInt()
                        root_matrix[1][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn33.text.toString().toInt()
                        root_matrix[2][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn43.text.toString().toInt()
                        root_matrix[3][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn53.text.toString().toInt()
                        root_matrix[4][2] = Pair(elem, -1*elem)
                        elem = bindingClass.etn14.text.toString().toInt()
                        root_matrix[0][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn24.text.toString().toInt()
                        root_matrix[1][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn34.text.toString().toInt()
                        root_matrix[2][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn44.text.toString().toInt()
                        root_matrix[3][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn54.text.toString().toInt()
                        root_matrix[4][3] = Pair(elem, -1*elem)
                        elem = bindingClass.etn15.text.toString().toInt()
                        root_matrix[0][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn25.text.toString().toInt()
                        root_matrix[1][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn35.text.toString().toInt()
                        root_matrix[2][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn45.text.toString().toInt()
                        root_matrix[3][4] = Pair(elem, -1*elem)
                        elem = bindingClass.etn55.text.toString().toInt()
                        root_matrix[4][4] = Pair(elem, -1*elem)
                    }
                }
            }
        }
        return root_matrix
    }

    fun hideStrategy1(tempset1: MutableSet<Int>, tempset2: MutableSet<Int>, bindingClass: ActivityRandomBinding){
        for (elem in tempset1) { //str
            when (elem) {
                0 -> {
                    bindingClass.str1.visibility = View.GONE
                }
                1 -> {
                    bindingClass.str2.visibility = View.GONE
                }
                2 -> {
                    bindingClass.str3.visibility = View.GONE
                }
                3 -> {
                    bindingClass.str4.visibility = View.GONE
                }
                4 -> {
                    bindingClass.str5.visibility = View.GONE
                }
            }
        }

        for (elem in tempset2) { //str
            when (elem) {
                0 -> {
                    bindingClass.tvB1.visibility = View.GONE
                    bindingClass.etn51.visibility = View.GONE
                    bindingClass.etn41.visibility = View.GONE
                    bindingClass.etn31.visibility = View.GONE
                    bindingClass.etn21.visibility = View.GONE
                    bindingClass.etn11.visibility = View.GONE
                }
                1 -> {
                    bindingClass.tvB2.visibility = View.GONE
                    bindingClass.etn52.visibility = View.GONE
                    bindingClass.etn42.visibility = View.GONE
                    bindingClass.etn32.visibility = View.GONE
                    bindingClass.etn22.visibility = View.GONE
                    bindingClass.etn12.visibility = View.GONE
                }
                2 -> {
                    bindingClass.tvB3.visibility = View.GONE
                    bindingClass.etn53.visibility = View.GONE
                    bindingClass.etn43.visibility = View.GONE
                    bindingClass.etn33.visibility = View.GONE
                    bindingClass.etn23.visibility = View.GONE
                    bindingClass.etn13.visibility = View.GONE
                }
                3 -> {
                    bindingClass.tvB4.visibility = View.GONE
                    bindingClass.etn54.visibility = View.GONE
                    bindingClass.etn44.visibility = View.GONE
                    bindingClass.etn34.visibility = View.GONE
                    bindingClass.etn24.visibility = View.GONE
                    bindingClass.etn14.visibility = View.GONE
                }
                4 -> {
                    bindingClass.tvB5.visibility = View.GONE
                    bindingClass.etn55.visibility = View.GONE
                    bindingClass.etn45.visibility = View.GONE
                    bindingClass.etn35.visibility = View.GONE
                    bindingClass.etn25.visibility = View.GONE
                    bindingClass.etn15.visibility = View.GONE
                }
            }
        }

    }

}