package com.example.hellokity

import android.R
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hellokity.databinding.ActivitySecondBinding
import com.example.myapplication.Bi_Matrix_function

class SecondActivity : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE
    }

    companion object {
        const val COUNT_S_A = "count_s_a"
        const val COUNT_S_B = "count_s_b"
        const val ARR_S_A = "arr_s_a"
        const val ARR_S_B = "arr_s_b"
    }

    val alg = arrayOf("Выберите алгоритм","Максимин игрока 1", "Минимакс игрока 2", "Удаление НЛО стратегий игроков",
        "Слабо доминируемые стратегии игрока 1", "Слабо доминируемые стратегии игрока 2",
        "Строго доминируемые стратегии игрока 1", "Строго доминируемые стратегии игрока 2",
        "Равновесие по НЭШу в чистых стратегиях", "Равновесие по НЭШу в смешанных стратегиях в матрице 2х2")

    lateinit var bindingClass: ActivitySecondBinding
    var n: Int = 0
    var m: Int = 0
    var arrA = arrayOf("")
    var arrB = arrayOf("")
    var root_matrix = MutableList(0) { r -> MutableList(0) { c -> Pair(0, 0) } }
    var delStrat1: MutableSet<Int> = mutableSetOf<Int>()

    var delStrat2: MutableSet<Int> = mutableSetOf<Int>()
    var del_root_matrix = MutableList(0) { r -> MutableList(0) { c -> Pair(0, 0) } }
    var deln: Int = 0
    var delm: Int = 0
    var flagPlayer = false
    var flaghide = true
    var p2Global = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindingClass = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val countA = intent.getIntExtra(COUNT_S_A, 0)
        val countB = intent.getIntExtra(COUNT_S_B, 0)
        arrA = intent.getStringArrayExtra(ARR_S_A)!!
        arrB = intent.getStringArrayExtra(ARR_S_B)!!

        n = countA; //количество стр
        m = countB; //количество стб

        root_matrix = MutableList(n) { r -> MutableList(m) { c -> Pair(0, 0) } }
        inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало

        var listMaxmin : MutableList<Pair<Int, Int>> = mutableListOf<Pair<Int, Int>>()

        val arrayAdapter = ArrayAdapter<String> (this, R.layout.simple_spinner_dropdown_item, alg)
        bindingClass.spinner.adapter = arrayAdapter
        bindingClass.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                bindingClass.del.visibility = View.GONE
                bindingClass.delstr.visibility = View.GONE
                var ppred = 0
                p2Global = p2
                //вызов функции открытия всех нужных стб и стр
                when (p2){
                    1 ->{
                        inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        delStrat1.clear()
                        delStrat2.clear()
                        flaghide = true
                        //maximinA
                        listMaxmin = Bi_Matrix_function.maxmin(root_matrix, n, m)
                        var smaxmin:String = "maxmin\ni j value\n"
                        for(elem in listMaxmin){
                            smaxmin += elem.first.toString() + " " + elem.second.toString() + " " +
                                    root_matrix[elem.first][elem.second] + "\n"
                        }
                        bindingClass.textViewA.text = smaxmin
                        ppred = 1
                    }
                    2 ->{
                        inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        delStrat1.clear()
                        delStrat2.clear()
                        flaghide = true
                        //minimaxB
                        listMaxmin = Bi_Matrix_function.minmax(root_matrix, n, m)
                        var sminmax:String = "minmax\ni j value\n"
                        for(elem in listMaxmin){
                            sminmax += elem.first.toString() + " " + elem.second.toString() + " " +
                                    root_matrix[elem.first][elem.second] + "\n"
                        }
                        bindingClass.textViewA.text = sminmax
                        ppred = 2
                    }
                    3 -> {
                        if (flaghide) {
                            inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        }

                        flaghide = false

                        if((delStrat1.size == 0) && (delStrat2.size == 0)){
                            del_root_matrix = root_matrix
                            deln = n
                            delm = m
                        }

                        //Удаление НЛО стратегий
                        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
                        var tempset2: MutableSet<Int> = mutableSetOf<Int>()

                        tempset1 = Bi_Matrix_function.searchnlo1(del_root_matrix, deln, delm)
                        tempset2 = Bi_Matrix_function.searchnlo2(del_root_matrix, deln, delm)
                        var s1 : String = "Удаление y 1\n"
                        var delta = 0
                        var namestr : String = ""
                        var delnew1 : MutableList<Boolean> = MutableList(n){false}
                        for(d in 0 until n){
                            if(delStrat1.contains(d)){
                                delnew1[d] = true
                            }
                        }
                        for(elem in tempset1){
                            var inttemp = 0
                            delta = 0
                            for(d in 0 until n){

                                if(!delnew1[d]) inttemp++
                                else delta++
                                if(inttemp > elem) {
                                    s1+= (elem + delta).toString() + " "
                                    namestr+= arrA[elem + delta] + " "
                                    break;
                                }
                            }
                        }
                        s1+= "\n" + namestr

                        var s2 : String = "\nУдаление y 2\n"
                        delta = 0
                        namestr = ""
                        var delnew2 : MutableList<Boolean> = MutableList(m){false}
                        for(d in 0 until m){
                            if(delStrat2.contains(d)){
                                delnew2[d] = true

                            }
                        }
                        for(elem in tempset2){
                            var inttemp = 0
                            delta = 0
                            for(d in 0 until m){

                                if(!delnew2[d]) inttemp++
                                else delta++
                                if(inttemp > elem) {
                                    s2+= (elem + delta).toString() + " "
                                    namestr+= arrB[elem + delta] + " "
                                    break;
                                }
                            }
                        }
                        s2+= "\n" + namestr

                        bindingClass.textViewA.text = s1 + s2
                        bindingClass.del.visibility = View.VISIBLE

                    }
                    4-> {
                        if (flaghide) {
                            inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        }

                        flaghide = false

                        bindingClass.delstr.visibility = View.VISIBLE
                        bindingClass.del.visibility = View.VISIBLE

                        //Слабо доминируемые стратегии игрока 1
                        if((delStrat1.size == 0) && (delStrat2.size == 0)){
                            del_root_matrix = root_matrix
                            deln = n
                            delm = m
                        }
                        flagPlayer = false
                        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
                        var tempset2: MutableSet<Int> = mutableSetOf<Int>()
                        var s : String = "СлабДС y 1\n"
                        tempset1 =  Bi_Matrix_function.searchweaklydominate1(del_root_matrix, deln, delm)
                        var delta = 0
                        var namestr : String = ""
                        var delnew1 : MutableList<Boolean> = MutableList(n){false}
                        for(d in 0 until n){
                            if(delStrat1.contains(d)){
                                delnew1[d] = true
                            }
                        }
                        for(elem in tempset1){
                            var inttemp = 0
                            delta = 0
                            for(d in 0 until n){

                                if(!delnew1[d]) inttemp++
                                else delta++
                                if(inttemp > elem) {
                                    s+= (elem + delta).toString() + " "
                                    namestr+= arrA[elem + delta] + " "
                                    break;
                                }
                            }
                        }
                        s+= "\n" + namestr

                        bindingClass.textViewA.text = s

                        //}



                    }
                    5 ->{
                        if (flaghide) {
                            inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        }
                        flaghide = false
                        bindingClass.delstr.visibility = View.VISIBLE
                        bindingClass.del.visibility = View.VISIBLE

                        //Слабо доминируемые стратегии игрока 2
                        if((delStrat1.size == 0) && (delStrat2.size == 0)){
                            del_root_matrix = root_matrix
                            deln = n
                            delm = m
                        }
                        flagPlayer = true
                        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
                        var tempset2: MutableSet<Int> = mutableSetOf<Int>()
                        //if (flagPlayer){ //для 2 игрока
                        var s : String = "СлабДС y 2\n"
                        tempset2 =  Bi_Matrix_function.searchweaklydominate2(del_root_matrix, deln, delm)
                        for (elem in tempset2){
                            Log.d("mmmmm", "elem" + elem.toString())
                        }
                        Log.d("Meow", tempset2.size.toString())
                        var delta = 0
                        var namestr : String = ""
                        var delnew2 : MutableList<Boolean> = MutableList(m){false}
                        for(d in 0 until m){
                            if(delStrat2.contains(d)){
                                delnew2[d] = true

                            }
                        }
                        for(elem in tempset2){
                            var inttemp = 0
                            delta = 0
                            for(d in 0 until m){

                                if(!delnew2[d]) inttemp++
                                else delta++
                                if(inttemp > elem) {
                                    s+= (elem + delta).toString() + " "
                                    namestr+= arrB[elem + delta] + " "
                                    break;
                                }
                            }
                        }
                        s+= "\n" + namestr

                        bindingClass.textViewA.text = s

                        //}

                    }
                    6 ->{
                        if (flaghide) {
                            inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        }
                        flaghide = false
                        if((delStrat1.size == 0) && (delStrat2.size == 0)){
                            del_root_matrix = root_matrix
                            deln = n
                            delm = m
                        }
                        bindingClass.del.visibility = View.VISIBLE
                        //Строго доминируемые стратегии игрока 1
                        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
                        var tempset2: MutableSet<Int> = mutableSetOf<Int>()
                        tempset1 = Bi_Matrix_function.searchdominate1(del_root_matrix, deln, delm)
                        var s : String = "СтрДС y 1\n"
                        var delta = 0
                        var namestr : String = ""
                        var delnew1 : MutableList<Boolean> = MutableList(n){false}
                        for(d in 0 until n){
                            if(delStrat1.contains(d)){
                                delnew1[d] = true
                            }
                        }
                        for(elem in tempset1){
                            var inttemp = 0
                            delta = 0
                            for(d in 0 until n){

                                if(!delnew1[d]) inttemp++
                                else delta++
                                if(inttemp > elem) {
                                    s+= (elem + delta).toString() + " "
                                    namestr+= arrA[elem + delta] + " "
                                    break;
                                }
                            }
                        }
                        s+= "\n" + namestr
                        bindingClass.textViewA.text = s
                    }
                    7 ->{
                        if (flaghide) {
                            inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        }
                        flaghide = false
                        if((delStrat1.size == 0) && (delStrat2.size == 0)){
                            del_root_matrix = root_matrix
                            deln = n
                            delm = m
                        }
                        bindingClass.del.visibility = View.VISIBLE
                        //Строго доминируемые стратегии игрока 2
                        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
                        var tempset2: MutableSet<Int> = mutableSetOf<Int>()
                        tempset2 = Bi_Matrix_function.searchdominate2(del_root_matrix, deln, delm)
                        var s : String = "СтрДС y 2\n"
                        var delta = 0
                        var namestr : String = ""
                        var delnew2 : MutableList<Boolean> = MutableList(m){false}
                        for(d in 0 until m){
                            if(delStrat2.contains(d)){
                                delnew2[d] = true

                            }
                        }
                        for(elem in tempset2){
                            var inttemp = 0
                            delta = 0
                            for(d in 0 until m){

                                if(!delnew2[d]) inttemp++
                                else delta++
                                if(inttemp > elem) {
                                    s+= (elem + delta).toString() + " "
                                    namestr+= arrB[elem + delta] + " "
                                    break;
                                }
                            }
                        }
                        s+= "\n" + namestr
                        bindingClass.textViewA.text = s

                    }
                    8 ->{
                        inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        delStrat1.clear()
                        delStrat2.clear()
                        flaghide = true
                        //Равновесие по НЭШу в чистых стратегиях
                        var nash : MutableSet<Pair<Int, Int>> = Bi_Matrix_function.searchnash(root_matrix, n, m)
                        var snash:String = "Равновесие по НЭШу\ni j value\n"
                        for(elem in nash){
                            snash += elem.first.toString() + " " + elem.second.toString() + " " +
                                    root_matrix[elem.first][elem.second] + "\n"
                        }
                        bindingClass.textViewA.text = snash
                        ppred = 8
                    }
                    9-> {
                        delStrat1.clear()
                        delStrat2.clear()
                        inputRandom.inputClearTable2(n, m, arrA, arrB, bindingClass) //выводим начало
                        flaghide = true
                        if ((n != 2) and (m != 2)){
                            bindingClass.textViewA.text = "Ошибка\nВведите матрицу 2х2 "
                        } else {
                            //Pавновесия по Нэшу в смешанных стратегия в матрице 2х2
                            var resset: MutableList<Pair<Double, Double>> =
                                Bi_Matrix_function.searchnashsmesh(root_matrix, n, m)
                            var snash: String = "Равновесие по НЭШу\n"
                            var flagtemp = true
                            for (elem in resset) {
                                if (flagtemp) {
                                    snash += "p"
                                    flagtemp = false
                                } else snash += "q"
                                snash += " = " + elem.toString() + "\n"
                            }
                            bindingClass.textViewA.text = snash
                            ppred = 9
                        }
                    }


                }

                Toast.makeText(applicationContext, alg[p2], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }

    fun onClickAdd(view: View) {
        root_matrix = input.inputtable2(root_matrix, n, m, arrA, arrB, bindingClass)
    }

    fun onClickGetRandom(view: View) {
        inputRandom.inputtable2(n, m, arrA, arrB, bindingClass)
    }


    fun onClickDelete(view: View) {
        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
        var tempset2: MutableSet<Int> = mutableSetOf<Int>()
        when (p2Global){
            3->{ //NLO
                tempset1 = Bi_Matrix_function.searchnlo1(del_root_matrix, deln, delm)
                tempset2 = Bi_Matrix_function.searchnlo2(del_root_matrix, deln, delm)
                var tempset3: MutableSet<Int> = mutableSetOf<Int>()
                var tempset4: MutableSet<Int> = mutableSetOf<Int>()
                bindingClass.del.visibility = View.GONE
                bindingClass.textViewA.text = "Нет НЛО"

                var temptriple = Bi_Matrix_function.delnlo(del_root_matrix, deln, delm)
                del_root_matrix = temptriple.first
                deln = temptriple.second
                delm = temptriple.third

                //для 1
                var delta = 0
                var delnew1 : MutableList<Boolean> = MutableList(n){false}
                for(d in 0 until n){
                    if(delStrat1.contains(d)){
                        delnew1[d] = true
                    }
                }
                for(elem in tempset1){
                    var inttemp = 0
                    delta = 0
                    for(d in 0 until n){

                        if(!delnew1[d]) inttemp++
                        else delta++
                        if(inttemp > elem) {
                            delStrat1.add(elem + delta)
                            tempset3.add(elem + delta)
                            break;
                        }
                    }
                }
                //для 2
                delta = 0
                var delnew2 : MutableList<Boolean> = MutableList(m){false}
                for(d in 0 until m){
                    if(delStrat2.contains(d)){
                        delnew2[d] = true

                    }
                }
                for(elem in tempset2){
                    var inttemp = 0
                    delta = 0
                    for(d in 0 until m){

                        if(!delnew2[d]) inttemp++
                        else delta++
                        if(inttemp > elem) {
                            delStrat2.add(elem + delta)
                            tempset4.add(elem + delta)
                            break;
                        }
                    }
                }
                input.hideStrategy2(tempset3,tempset4,bindingClass)


            }
            4 ->{ //Slab1
                tempset1 = Bi_Matrix_function.searchweaklydominate1(del_root_matrix, deln, delm)
                var delta = 0
                var s: String = "СлабДС y 1\n"

                var hideStrat = bindingClass.delstr.text.toString().toInt()
                delta = 0
                for (i in 0..hideStrat) {
                    if (delStrat1.contains(i)) {
                        delta++
                    }
                }
                var delStrat = hideStrat - delta

                if (tempset1.contains(delStrat)) {

                    var temptriple = Bi_Matrix_function.delweaklydominate(
                        del_root_matrix,
                        deln,
                        delm,
                        false,
                        delStrat
                    )
                    del_root_matrix = temptriple.first
                    deln = temptriple.second
                    delm = temptriple.third
                    if(true){
                        var temp = ""
                        for(i in 0 until deln){
                            temp = ""
                            for(j in 0 until delm){
                                temp += del_root_matrix[i][j].toString() + " "
                            }
                            Log.d("HelloKitty", "root" + temp)
                        }
                    }

                    var hideset = mutableSetOf<Int>(hideStrat)
                    input.hideStrategy2(hideset, tempset2, bindingClass)
                    delStrat1.add(hideStrat)
                    Log.d("HelloKitty", "hideStrat" + hideStrat.toString())

                    //еще раз вывод стратегий
                    tempset1 =  Bi_Matrix_function.searchweaklydominate1(del_root_matrix, deln, delm)
                    if(true){
                        var temp:String = ""
                        for(elem in tempset1){
                            temp+= elem.toString() + " "
                        }
                        Log.d("HelloKitty", "tempset1- " + temp)
                        temp = ""
                        for(elem in delStrat1){
                            temp+= elem.toString() + " "
                        }
                        Log.d("HelloKitty", "delStrat1- " + temp)
                    }
                    delta = 0
                    var delnew1 : MutableList<Boolean> = MutableList(n){false}
                    for(d in 0 until n){
                        if(delStrat1.contains(d)){
                            delnew1[d] = true
                        }
                    }
                    delta = 0
                    //вроде рабочее
                    var namestr : String = ""
                    for(elem in tempset1){
                        var inttemp = 0
                        delta = 0
                        for(d in 0 until n){

                            if(!delnew1[d]) inttemp++
                            else delta++
                            if(inttemp > elem) {
                                s+= (elem + delta).toString() + " "
                                namestr+= arrA[elem + delta] + " "
                                break;
                            }
                        }
                    }
                    s+= "\n" + namestr
                    s +="\n"

                    bindingClass.textViewA.text = s
                }
            }
            5 -> { //Slab2
                tempset2 = Bi_Matrix_function.searchweaklydominate2(del_root_matrix, deln, delm)
                var delta = 0
                var s: String = "СлабДС y 2\n"

                var hideStrat = bindingClass.delstr.text.toString().toInt()
                delta = 0
                for (i in 0..hideStrat) {
                    if (delStrat2.contains(i)) {
                        delta++
                    }
                }
                var delStrat = hideStrat - delta

                if (tempset2.contains(delStrat)) {

                    var temptriple = Bi_Matrix_function.delweaklydominate(
                        del_root_matrix,
                        deln,
                        delm,
                        true,
                        delStrat
                    )
                    del_root_matrix = temptriple.first
                    deln = temptriple.second
                    delm = temptriple.third
                    if(true){
                        var temp = ""
                        for(i in 0 until deln){
                            temp = ""
                            for(j in 0 until delm){
                                temp += del_root_matrix[i][j].toString() + " "
                            }
                            Log.d("HelloKitty2", "root" + temp)
                        }
                    }

                    var hideset = mutableSetOf<Int>(hideStrat)
                    input.hideStrategy2(tempset1, hideset, bindingClass)
                    delStrat2.add(hideStrat)
                    Log.d("HelloKitty2", "hideStrat" + hideStrat.toString())

                    //еще раз вывод стратегий
                    tempset2 =  Bi_Matrix_function.searchweaklydominate2(del_root_matrix, deln, delm)
                    if(true){
                        var temp:String = ""
                        for(elem in tempset2){
                            temp+= elem.toString() + " "
                        }
                        Log.d("HelloKitty2", "tempset2- " + temp)
                        temp = ""
                        for(elem in delStrat2){
                            temp+= elem.toString() + " "
                        }
                        Log.d("HelloKitty2", "delStrat2- " + temp)
                    }
                    delta = 0
                    var delnew2 : MutableList<Boolean> = MutableList(m){false}
                    for(d in 0 until m){
                        if(delStrat2.contains(d)){
                            delnew2[d] = true
                        }
                    }
                    delta = 0
                    //вроде рабочее
                    var namestr : String = ""
                    for(elem in tempset2){
                        var inttemp = 0
                        delta = 0
                        for(d in 0 until m){

                            if(!delnew2[d]) inttemp++
                            else delta++
                            if(inttemp > elem) {
                                s+= (elem + delta).toString() + " "
                                namestr+= arrB[elem + delta] + " "
                                break;
                            }
                        }
                    }
                    s+= "\n" + namestr
                    s +="\n"

                    bindingClass.textViewA.text = s
                }

            }
            6-> {
                //Sila1
                var tempset3: MutableSet<Int> = mutableSetOf<Int>()
                tempset1 = Bi_Matrix_function.searchdominate1(del_root_matrix, deln, delm)
                bindingClass.del.visibility = View.GONE
                bindingClass.textViewA.text = "Нет стрДС"
                var temptriple = Bi_Matrix_function.fit_to_size(tempset1, tempset2, del_root_matrix, deln, delm,)
                del_root_matrix = temptriple.first
                deln = temptriple.second
                delm = temptriple.third
                var delta = 0
                var delnew1 : MutableList<Boolean> = MutableList(n){false}
                for(d in 0 until n){
                    if(delStrat1.contains(d)){
                        delnew1[d] = true
                    }
                }
                for(elem in tempset1){
                    var inttemp = 0
                    delta = 0
                    for(d in 0 until n){

                        if(!delnew1[d]) inttemp++
                        else delta++
                        if(inttemp > elem) {
                            delStrat1.add(elem + delta)
                            tempset3.add(elem + delta)
                            break;
                        }
                    }
                }
                input.hideStrategy2(tempset3,tempset2,bindingClass)
            }
            7 -> {
                //Sila2
                var tempset4: MutableSet<Int> = mutableSetOf<Int>()
                tempset2 = Bi_Matrix_function.searchdominate2(del_root_matrix, deln, delm)

                var temptriple = Bi_Matrix_function.fit_to_size(tempset1,tempset2,del_root_matrix, deln, delm)
                del_root_matrix = temptriple.first
                deln = temptriple.second
                delm = temptriple.third
                //input.hideStrategy2(tempset1,tempset2,bindingClass)
                bindingClass.del.visibility = View.GONE
                bindingClass.textViewA.text = "Нет стрДС"
                var delta = 0
                var delnew2 : MutableList<Boolean> = MutableList(m){false}
                for(d in 0 until m){
                    if(delStrat2.contains(d)){
                        delnew2[d] = true

                    }
                }
                for(elem in tempset2){
                    var inttemp = 0
                    delta = 0
                    for(d in 0 until m){

                        if(!delnew2[d]) inttemp++
                        else delta++
                        if(inttemp > elem) {
                            delStrat2.add(elem + delta)
                            tempset4.add(elem + delta)
                            break;
                        }
                    }
                }
                input.hideStrategy2(tempset1,tempset4,bindingClass)

            }
        }
        bindingClass.delstr.setText("")
    }

}
