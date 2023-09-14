package com.example.myapplication
import java.io.BufferedReader
import java.io.FileReader
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Scanner
import kotlin.math.roundToInt

fun getStrategy(Str : String): Pair<Int, Int> { //разбить строку на подстроки с разделителем ,
    val delim = ";"
    val arr = Str.split(delim).toTypedArray()
    var temppair = Pair(arr[0].toInt(),arr[1].toInt())
    return temppair
}

fun getUtility(Str : String): Array<String> { //разбить строку на подстроки с разделителем ,
    val delim = " "
    val arr = Str.split(delim).toTypedArray()
    println("Good get arr")
    return arr
}

fun vyvod( root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int,flagmatmod : Boolean): String{
    var s : String = ""
            for(i in 0 until n){
                for(j in 0 until m){
                    if(!flagmatmod) {//проверить може добавить !
                        s += root_matrix[i][j].first.toString() + ";" + root_matrix[i][j].second.toString() + " "
                    }else{
                        s +=  root_matrix[i][j].first.toString() + " "
                    }
                }
                s += "\n"
            }
    return s
}

fun vyvodlistpair( root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int, list : MutableList<Pair<Int, Int>>): String{
    var s : String = ""
    for(elem in list){
        s += "индексы: " + elem.first.toString() + " " + elem.second.toString() + ", значение: " +
                root_matrix[elem.first][elem.second].first.toString() + " " +
                root_matrix[elem.first][elem.second].second.toString() + "\n"
    }

    return s
}

fun vyvodsetint(set : MutableSet<Int>): String{
    var s : String = ""
    for(elem in set){
        s += elem.toString() + " "
    }
    s += "\n"
    return s
}

fun vyvodsetpairint(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int, set : MutableSet<Pair<Int,Int>>): String{
    var s : String = ""
     for(elem in set){
        s += "Индекс" + elem.first.toString() + " " + elem.second.toString() + ", значение:" +
                root_matrix[elem.first][elem.second].toString()
    }
    s += "\n"
    return s
}

fun vyvodlistpairdouble(set : MutableList<Pair<Double,Double>>): String{
    var s : String = ""
    var flag = true
    for(elem in set){
        if(flag) {s+= "p"
            flag = false} else s+= "q"
        s += " = (" + ((elem.first * 100).roundToInt()/100.0).toString() + ";" +
                ((elem.second * 100).roundToInt()/100.0).toString() + ")\n"
    }
    s += "\n"
    return s
}

fun main(/*args: Array<String>*/) {
    println("Hello World!")
    val scanner = Scanner(System.`in`)//.useDelimiter(" ")

    //объявление переменных для хранения вывода функций

    var setNeshChist : MutableSet<Pair<Int,Int>> = mutableSetOf<Pair<Int,Int>>()
    var setNesh2x2 : MutableList<Pair<Double,Double>> = mutableListOf<Pair<Double, Double>>()

    var chr : String = " "
    var n : Int = 0
    var m : Int = 0


    var chrmatmod = ""//мат. модель матрич или нет (мат-1, иначе биматр)
    var outstr = ""//для вывода в файл

    var root_matrix : MutableList<MutableList<Pair<Int, Int>>> = MutableList(n){r ->
        kotlin.collections.MutableList(m) { c ->
            kotlin.Pair(0, 0)
        }
    }

    //объявление переменных для хранения вывода функций
    var delsetStrogodominir : Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> = Triple(root_matrix, n, m)
    var delsetSlabodominir : Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> = Triple(root_matrix, n, m)
    var delNLO : Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> = Triple(root_matrix, n, m)

    var flagmatmod : Boolean = false
    var flagressearch = false
    var sres : String = ""
    //var num : Int
    while(true){
        println("Введите символ: \n1 - консольный ввод,\n2 - файловый ввод,\n3 - консольный вывод," +
                "\n4 - файловый вывод,\n5 - применение алгоритмов поиска,\n" +
                "6 - применения алгоритмов рационализации,\n0 - конец программы\n")
        var flagexception = true
        var flagchar = true
        while(flagchar){
            try {
                flagexception = true
                chr = scanner.next().single().lowercase()

            }
            catch (e : Exception){
                println("Exception: " + e.message)
                flagexception = false
                scanner.nextLine()
            }finally {
                if(flagexception) flagchar = false;
            }
        }


        when(chr){
            "1" -> {
                flagressearch = false
                sres = ""
                println("Консольный ввод\n")
                var flag : Boolean
                println("Введите количество стратегий первого игрока")
                n = scanner.nextInt()
                println("Введите количество стратегий второго игрока")
                m = scanner.nextInt()
                root_matrix = MutableList(n){r ->
                    kotlin.collections.MutableList(m) { c ->
                        kotlin.Pair(0, 0)
                    }
                }
                println("Введите символ 1, если матричная модель\n")
                chrmatmod = scanner.next().single().lowercase()
                if(chrmatmod == "1"){
                    flagmatmod = true
                    println("Матричная модель\nВведите ")
                    for(i in 0 until n){
                        for(j in 0 until m){
                            var temp = scanner.nextInt()
                            root_matrix[i][j] =  Pair(temp, (temp*(-1)))
                        }
                    }
                }else{
                    flagmatmod = false
                    println("Биматричная модель")
                    for(i in 0 until n){
                        for(j in 0 until m){
                            var temp = getStrategy(scanner.next())
                            root_matrix[i][j] = temp
                        }
                    }
                }


            }
            "2" -> {
                flagressearch = false
                sres = ""
                println("Файловый ввод\n")
                var sch: Int = 0
                var schmatr: Int = 0
                var i = 0
                BufferedReader(FileReader("test1.txt")).use { br ->
                    var line: String?

                    while (br.readLine().also { line = it } != null) {
                        sch++
                        if (sch == 1) {
                            if (line == "1") {
                                schmatr = (line.toString()).toInt()
                                println("Матричная модель\n")
                            } else {
                                println("Биматричная модель\n")
                            }
                        }
                        if (sch == 2) {
                            println("Ко-во стратегий 1-го игрока:")
                            n = (line.toString()).toInt()
                            println(n)
                        }
                        if (sch == 3) {
                            println("Ко-во стратегий 2-го игрока: ")
                            m = (line.toString()).toInt()
                            println(m)
                            root_matrix = MutableList(n) { r ->
                                kotlin.collections.MutableList(m) { c ->
                                    kotlin.Pair(0, 0)
                                }
                            }
                        }
                        if (sch > 3 && i < n) {
                            println("i" + i.toString())
                            var temps = line.toString()
                            var arr = getUtility(temps)
                            //println(temps)
                            //println("размер массива " + arr.size)
                            for (j in 0 until m) {

                                if (schmatr == 1) {
                                    root_matrix[i][j] = Pair(arr[j].toInt(), arr[j].toInt() * (-1))
                                    print(root_matrix[i][j].toString() + " ")
                                }
                                else{
                                    root_matrix[i][j] = getStrategy(arr[j])
                                    print(root_matrix[i][j].toString() + " ")
                                }

                            }
                            i++
                            println("")

                        }
                    }

                }
            }
            "3" -> {
                println("Консольный вывод\n")
                println(vyvod(root_matrix, n, m, flagmatmod) + "\n")
                if(flagressearch){
                    println("Результат поиска: \n" + sres)
                }

            }
            "4" -> {
                println("Файловый вывод\n")
                val file = Paths.get("test.txt")
                var stemp = vyvod(root_matrix, n, m, flagmatmod)
                if(flagressearch){
                    stemp +="Результат поиска: \n" + sres
                }
                Files.newBufferedWriter(file, Charsets.UTF_8).use{ it.write(stemp)}

            }
            "5" -> {
                flagressearch = true
                println("Применение алгоритмов поиска\n")
                println("Введите символ: \n1 - поиск максимина,\n2 - поиск минимакса,\n" +
                        "3 - поиск строгодоминируемых стратегий," +
                        "\n4 - поиск слабо доминируемых стратегий,\n5 - поиск НЛО стратегий,\n" +
                        "6 - поиск равновесия по Нэшу в чистых стратегиях,\n" +
                        "7 - Поиск равновесия по Нэшу в смешанных стратегия в матрице 2х2\n")
                var chralg : String = " "
                var flagexceptionalg = true
                var flagcharalg = true
                while(flagcharalg){
                    try {
                        flagexceptionalg = true
                        chralg = scanner.next().single().lowercase()
                    }
                    catch (e : Exception){
                        println("Exception: " + e.message)
                        flagexceptionalg = false
                        scanner.nextLine()
                    }finally {
                        if(flagexceptionalg) flagcharalg = false;
                    }
                }
                //println("f")
                when(chralg){
                    "1" -> {
                        var listMaxMin : MutableList<Pair<Int, Int>> = mutableListOf<Pair<Int,Int>>()
                        println("Поиск максимина")
                        sres += "Поиск максимина\n"
                        listMaxMin = Bi_Matrix_function.maxmin(root_matrix, n, m)
                        sres += vyvodlistpair(root_matrix, n, m, listMaxMin)

                    }
                    "2" -> {
                        var listMinMax : MutableList<Pair<Int, Int>> = mutableListOf<Pair<Int,Int>>()
                        println("Поиск минимакса")
                        sres += "Поиск минимакса\n"
                        listMinMax = Bi_Matrix_function.minmax(root_matrix, n, m)
                        sres += vyvodlistpair(root_matrix, n, m, listMinMax)
                    }
                    "3" -> {
                        var setStrogodominir1 : MutableSet<Int> = mutableSetOf<Int>()
                        var setStrogodominir2 : MutableSet<Int> = mutableSetOf<Int>()
                        println("Поиск строго доминируемых стратегий")
                        sres += "Поиск строго доминируемых стратегий\n"
                        sres += "Для первого игрока: "
                        setStrogodominir1 = Bi_Matrix_function.searchdominate1(root_matrix, n, m)
                        sres += vyvodsetint(setStrogodominir1)
                        sres += "Для второго игрока: "
                        setStrogodominir2 = Bi_Matrix_function.searchdominate2(root_matrix, n, m)
                        sres += vyvodsetint(setStrogodominir2)
                    }
                    "4" -> {
                        var setSlabodominir1 : MutableSet<Int> = mutableSetOf<Int>()
                        var setSlabodominir2 : MutableSet<Int> = mutableSetOf<Int>()

                        println("Поиск слабо доминируемых стратегий ")
                        sres += "Поиск слабо доминируемых стратегий\n"
                        sres += "Для первого игрока: "
                        setSlabodominir1 = Bi_Matrix_function.searchweaklydominate1(root_matrix, n, m)
                        sres += vyvodsetint(setSlabodominir1)
                        sres += "Для второго игрока: "
                        setSlabodominir2 = Bi_Matrix_function.searchweaklydominate2(root_matrix, n, m)
                        sres += vyvodsetint(setSlabodominir2)
                    }
                    "5" -> {
                        var setNLO1 : MutableSet<Int> = mutableSetOf<Int>()
                        var setNLO2 : MutableSet<Int> = mutableSetOf<Int>()
                        println("Поиск НЛО стратегий")
                        sres += "Поиск НЛО стратегий\n"
                        sres += "Для первого игрока: "
                        setNLO1 = Bi_Matrix_function.searchnlo1(root_matrix, n, m)
                        sres += vyvodsetint(setNLO1)
                        sres += "Для второго игрока: "
                        setNLO2 = Bi_Matrix_function.searchnlo2(root_matrix, n, m)
                        sres += vyvodsetint(setNLO2)
                    }
                    "6" -> {
                        println("Поиск равновесия по Нэшу в чистых стратегиях")
                        sres += "Поиск равновесия по Нэшу в чистых стратегиях\n"
                        setNeshChist = Bi_Matrix_function.searchnash(root_matrix, n, m)
                        sres += vyvodsetpairint(root_matrix, n, m, setNeshChist)
                    }
                    "7" -> {
                        println("Поиск равновесия по Нэшу в смешанных стратегия в матрице 2х2")
                        sres += "Поиск равновесия по Нэшу в смешанных стратегия в матрице 2х2\n"
                        setNesh2x2 = Bi_Matrix_function.searchnashsmesh(root_matrix, n, m)
                        sres += vyvodlistpairdouble(setNesh2x2)
                    }
                    else -> {
                        println("Неккоректный ввод")
                    }
                }
            }
            "6" -> {
                flagressearch = true
                println("Применения алгоритмов рационализации\n")
                println("Введите символ: \n1 - удаление слабо доминируемых стратегий," +
                        "\n2 - удаление строго доминируемых стратегий," +
                        "\n3 - удаление НЛО стратегий\n")
                var chralg : String = " "
                var flagexceptionalg = true
                var flagcharalg = true
                while(flagcharalg){
                    try {
                        flagexceptionalg = true
                        chralg = scanner.next().single().lowercase()
                    }
                    catch (e : Exception){
                        println("Exception: " + e.message)
                        flagexceptionalg = false
                        scanner.nextLine()
                    }finally {
                        if(flagexceptionalg) flagcharalg = false;
                    }
                }

                when(chralg){
                    "1" -> {
                        var strat: Int = 0 // омер стратегии которую удалить
                        var flagplayer: Boolean = false //игрок 1
                        println("удаление слабо доминируемых стратегий")
                        sres += "Удаление слабо доминируемых стратегий\n"
                        sres += "Исходная матрица:\n" + vyvod(root_matrix, n, m, flagmatmod)
                        var idel:MutableSet<Int> = Bi_Matrix_function.searchweaklydominate1(root_matrix, n, m)
                        var jdel:MutableSet<Int> = Bi_Matrix_function.searchweaklydominate2(root_matrix, n, m)
                        println("1 игрок: " + vyvodsetint(idel))
                        println("2 игрок: " + vyvodsetint(jdel))
                        if(idel.size == 0 && jdel.size == 0){
                            println("Нет стратегий на удаление")
                        }else {
                            println("Выберите игрока(1 - первый игрок, иначе второй)\n")
                            var chrplayer: String = " "
                            var flagexceptionp = true
                            var flagcharp = true
                            while (flagcharp) {
                                try {
                                    flagexceptionp = true
                                    chrplayer = scanner.next().single().lowercase()
                                } catch (e: Exception) {
                                    println("Exception: " + e.message)
                                    flagexceptionp = false
                                    scanner.nextLine()
                                } finally {
                                    if (flagexceptionp) flagcharp = false;
                                }
                            }
                            if (chrplayer == "1") {
                                flagplayer = false
                            } else flagplayer = true
                            println("Выберите стратегию из множества этого игрока")
                            var chrset: String = " "
                            var flagexceptionset = true
                            var flagcharset = true
                            var flagchoose = false
                            while (!flagchoose) {
                                while (flagcharset) {
                                    try {
                                        flagexceptionset = true
                                        chrset = scanner.next().single().lowercase()
                                    } catch (e: Exception) {
                                        println("Exception: " + e.message)
                                        flagexceptionset = false
                                        scanner.nextLine()
                                    } finally {
                                        if (flagexceptionset) flagcharset = false;
                                    }
                                }
                                if (flagplayer) {
                                    if (jdel.contains(chrset.toInt())) {
                                        strat = chrset.toInt()
                                        flagchoose = true
                                        idel = mutableSetOf<Int>()
                                        sres += "У второго игрока удаляется стратегия - " + strat.toString() + "\n"
                                    }
                                } else {
                                    if (idel.contains(chrset.toInt())) {
                                        strat = chrset.toInt()
                                        flagchoose = true
                                        jdel = mutableSetOf<Int>()
                                        sres += "У первого игрока удаляется стратегия - " + strat.toString() + "\n"
                                    }
                                }
                            }


                            println("Полученная матрица\n")
                            delsetSlabodominir =
                                Bi_Matrix_function.delweaklydominate(root_matrix, n, m, flagplayer, strat)
                            sres += vyvod(
                                delsetSlabodominir.first,
                                delsetSlabodominir.second,
                                delsetSlabodominir.third,
                                flagmatmod
                            )
                            //sres += "Исходная матрица:\n" + vyvod(root_matrix, n, m, flagmatmod)
                            println(
                                vyvod(
                                    delsetSlabodominir.first,
                                    delsetSlabodominir.second,
                                    delsetSlabodominir.third,
                                    flagmatmod
                                )
                            )
                            println("Хотите продолжить работать с полученной матрице1?(1 - Да)")
                            var chralg1: String = " "
                            var flagexceptionalg1 = true
                            var flagcharalg1 = true
                            while (flagcharalg1) {
                                try {
                                    flagexceptionalg1 = true
                                    chralg1 = scanner.next().single().lowercase()
                                } catch (e: Exception) {
                                    println("Exception: " + e.message)
                                    flagexceptionalg1 = false
                                    scanner.nextLine()
                                } finally {
                                    if (flagexceptionalg1) flagcharalg1 = false;
                                }
                            }
                            if (chralg1 == "1") {
                                root_matrix = delsetSlabodominir.first
                                n = delsetSlabodominir.second
                                m = delsetSlabodominir.third
                                sres += "Матрица изменена на полученную!\n"
                            }

                        }
                    }
                    "2" -> {

                        println("Удаление строго доминируемых стратегий")
                        delsetStrogodominir = Bi_Matrix_function.deldominate(root_matrix, n, m)
                        sres += "Удаление строго доминируемых стратегий\n"
                        sres += "Исходная матрица:\n" + vyvod(root_matrix, n, m, flagmatmod)
                        sres += "Полученная матрица: \n" +
                                vyvod(delsetStrogodominir.first, delsetStrogodominir.second, delsetStrogodominir.third, flagmatmod)
                        println(vyvod(delsetStrogodominir.first, delsetStrogodominir.second, delsetStrogodominir.third, flagmatmod))
                        println("Хотите продолжить работать с полученной матрицей?(1 - Да)")
                        var chralg1 : String = " "
                        var flagexceptionalg1 = true
                        var flagcharalg1 = true
                        while(flagcharalg1){
                            try {
                                flagexceptionalg1 = true
                                chralg1 = scanner.next().single().lowercase()
                            }
                            catch (e : Exception){
                                println("Exception: " + e.message)
                                flagexceptionalg1 = false
                                scanner.nextLine()
                            }finally {
                                if(flagexceptionalg1) flagcharalg1 = false;
                            }
                        }
                        if(chralg1 == "1"){
                            root_matrix = delsetStrogodominir.first
                            n = delsetStrogodominir.second
                            m = delsetStrogodominir.third
                            sres += "Матрица изменена на полученную!\n"
                        }

                    }
                    "3" -> {
                        println("удаление НЛО стратегий")
                        delNLO = Bi_Matrix_function.delnlo(root_matrix, n, m)
                        sres += "Удаление НЛО стратегий\n"
                        sres += "Исходная матрица:\n" + vyvod(root_matrix, n, m, flagmatmod)
                        sres += "Полученная матрица: \n" + vyvod(delNLO.first, delNLO.second, delNLO.third, flagmatmod)
                        println(vyvod(delNLO.first, delNLO.second, delNLO.third, flagmatmod))
                        println("Хотите продолжить работать с полученной матрице1?(1 - Да)")
                        var chralg1 : String = " "
                        var flagexceptionalg1 = true
                        var flagcharalg1 = true
                        while(flagcharalg1){
                            try {
                                flagexceptionalg1 = true
                                chralg1 = scanner.next().single().lowercase()
                            }
                            catch (e : Exception){
                                println("Exception: " + e.message)
                                flagexceptionalg1 = false
                                scanner.nextLine()
                            }finally {
                                if(flagexceptionalg1) flagcharalg1 = false;
                            }
                        }
                        if(chralg1 == "1"){
                            root_matrix = delNLO.first
                            n = delNLO.second
                            m = delNLO.third
                            sres += "Матрица изменена на полученную!\n"
                        }

                    }
                    else -> {
                        println("Неккоректный ввод")
                    }
                }
            }
            "0" -> {
                println("The end\n")
                break;
            }
            else -> {
                println("Неккоректный ввод")
            }
        }
    }
    //Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

}


