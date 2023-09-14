package com.example.myapplication
//import android.util.Log

object Bi_Matrix_function {

    //i j хранятся в var arrij = arrayOf<Int>(i,j);
    //map<массив i j ><массив значений>
    //поиск максимина
        fun maxmin(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableList<Pair<Int, Int>> {
        var templist : MutableList<Pair<Int, Int>> = mutableListOf<Pair<Int, Int>>() //для вывода окончательный
        //var templist1 : MutableList<Array<Int>> = mutableListOf<Array<Int>>() //для поиска
        var tempmap : MutableMap<Pair<Int, Int>, Int> = mutableMapOf<Pair<Int, Int>, Int>() //для поиска
        var temparrij : Pair<Int, Int> = Pair(0,0)
        var flag = true
        var imaxmin : Int
        var jmaxmin : Int
        var znachmaxmin : Int = 0

        //Log.d("MyLogMActmaxmin", "GoodBegin")
        for(i in 0 until n){
            for(j in 0 until m){

                if(flag){
                    znachmaxmin = root_matrix[i][j].first //присваеваем значение полезности первого игрока
                    temparrij = Pair(i, j) //возможно лучше так прописывать
                    //imaxmin = i;
                    //jmaxmin = j;

                    //Log.d("MyLogMActmaxmin", znachmaxmin.toString())
                    flag = false;
                }else{
                    if (znachmaxmin > root_matrix[i][j].first) {
                        znachmaxmin = root_matrix[i][j].first
                        //imaxmin = i;
                        //jmaxmin = j;
                        //temparrij = Pair(i, j) //возможно лучше так


                    }
                    //Log.d("MyLogMActmaxmin", znachmaxmin.toString())
                }
            }
            for(j in 0 until m){
                if (znachmaxmin == root_matrix[i][j].first) {
                    tempmap[Pair(i, j)] = znachmaxmin
                    //jmaxmin = j;
                    //temparrij = Pair(i, j) //возможно лучше так


                }
            }

            //tempmap[temparrij] = znachmaxmin
            flag = true
        }
        //поиск максимума из минимумов
        znachmaxmin = tempmap.maxOf { it.value }

        //Log.d("MyLogMActmaxmin", "max" + znachmaxmin.toString())
        //определение всех максимумов
        for((key, value) in tempmap){
            //Log.d("MyLogMActmaxmin", value.toString())
            if(value == znachmaxmin){
                templist.add(key)
            }
        }
        //Log.d("MyLogMActmaxmin", "end")
        return templist
        }
    //поиск минимакса
        fun minmax(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableList<Pair<Int, Int>> {
            var templist : MutableList<Pair<Int, Int>> = mutableListOf<Pair<Int, Int>>() //для вывода окончательный
            //var templist1 : MutableList<Array<Int>> = mutableListOf<Array<Int>>() //для поиска
            var tempmap : MutableMap<Pair<Int, Int>, Int> = mutableMapOf<Pair<Int, Int>, Int>() //для поиска
            var temparrij : Pair<Int, Int> = Pair(0,0)
            var flag = true
            var imaxmin : Int
            var jmaxmin : Int
            var znachmaxmin : Int = 0

            //Log.d("MyLogMActminmax", "GoodBegin")
            for(j in 0 until m){
                for(i in 0 until n){
                    if(flag){
                        znachmaxmin = root_matrix[i][j].first //присваеваем значение полезности первого игрока
                        temparrij = Pair(i, j) //возможно лучше так прописывать
                        //imaxmin = i;
                        //jmaxmin = j;
                        //Log.d("MyLogMActminmax", znachmaxmin.toString())

                        flag = false;
                   }else{
                       if (znachmaxmin < root_matrix[i][j].first) {
                           znachmaxmin = root_matrix[i][j].first
                           //imaxmin = i;
                           //jmaxmin = j;
                          //temparrij = Pair(i, j) //возможно лучше так прописывать
                           }
                    //Log.d("MyLogMActminmax", znachmaxmin.toString())
                     }
                }
                for(i in 0 until n){
                    if (znachmaxmin == root_matrix[i][j].first) {
                        tempmap[Pair(i, j)] = znachmaxmin
                    }
                }
            //tempmap[temparrij] = znachmaxmin
            flag = true
              }
        //поиск максимума из минимумов
           znachmaxmin = tempmap.minOf{ it.value }

            //Log.d("MyLogMActminmax", "min" + znachmaxmin.toString())
          //определение всех максимумов
          for((key, value) in tempmap){
                //Log.d("MyLogMActminmax", value.toString())
                if(value == znachmaxmin){
                    templist.add(key)
                }
        }
        //Log.d("MyLogMActminmax", "end")
        return templist
    }
    //поиск строго доминиируемых стратегий для 2 игрока
    fun searchdominate2(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableSet<Int>{
        var tempset : MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
        for(i in 0 .. m-2){
            if(!tempset.contains(i)){
                for(k in (i+1)until m ){
                    var flagd1 = true; //все i > k
                    var flagd2 = true; //все i < k
                    for(j in 0 until n ){
                        //var temparr1 : Array<Int> = arrayOf(j, i)
                       // var temparr2 : Array<Int> = arrayOf(j, k)
                        if(root_matrix[j][i].second == root_matrix[j][k].second){
                            flagd2 = false;
                            flagd1 = false;
                        }else if(root_matrix[j][i].second > root_matrix[j][k].second){
                            flagd2 = false;
                        }else{
                            flagd1 = false;
                        }
                    }
                    if (flagd1) {
                        tempset.add(k)
                    }
                    else if(flagd2)
                    {
                        tempset.add(i)
                    }
                }
            }
        }
        return tempset
    }
    //поиск строго доминиируемых стратегий для 1 игрока
    fun searchdominate1(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableSet<Int>{
        var tempset : MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
        //Log.d("MyLogMActdom1", "begin")
        for(i in 0 .. n - 2){
            if(!tempset.contains(i)){
                for(k in (i+1) until n){
                    //Log.d("MyLogMActdom1", "loop " + i.toString() + " " + k.toString())
                    var flagd1 = true; //все i > k
                    var flagd2 = true; //все i < k
                    for(j in 0 until m ){
                        //Log.d("MyLogMActdom1", "loopj " + j.toString())
                        //var temparr1 : Array<Int> = arrayOf(i, j)
                        //var temparr2 : Array<Int> = arrayOf(k, j)
                        if(root_matrix[i][j].first == root_matrix[k][j].first){
                            flagd2 = false;
                            flagd1 = false;
                            //Log.d("MyLogMActdom1", "flags false")
                        }else if(root_matrix[i][j].first > root_matrix[k][j].first){
                            flagd2 = false;
                            //Log.d("MyLogMActdom1", "flag2 false")
                        }else{
                            flagd1 = false;
                            //Log.d("MyLogMActdom1", "flag1 false")
                        }
                    }
                    //Log.d("MyLogMActdom1", "loopjend")
                    if (flagd1) {
                        tempset.add(k)
                        //Log.d("MyLogMActdom1", "addk")
                    }else if(flagd2){
                        //Log.d("MyLogMActdom1", "addi")
                        tempset.add(i)
                        //Log.d("MyLogMActdom1", "addi")
                    }
                }
            }
        }
        return tempset
    }
    //удаление множества стратегий
    fun fit_to_size(idel:MutableSet<Int>, jdel:MutableSet<Int>, root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int):Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int>{
        var tempmatrix: MutableList<MutableList<Pair<Int, Int>>>  = MutableList(n-idel.size){ r -> MutableList(m-jdel.size){c -> Pair(0,0)} }
        var deltai : Int = 0
        var deltaj : Int = 0
        //Log.d("MyLogMActdel", "Matrix" + (n-idel.size).toString() + " " + (m-jdel.size).toString())
        for(i in 0 until n){
            if(idel.contains(i)){
                //Log.d("MyLogMActdel", "idel contain " + i.toString())
                deltai++
            }else{
                //Log.d("MyLogMActdel", "idel not contain " + i.toString())
                deltaj = 0
                //var templist : MutableList<Pair<Int, Int>> = mutableListOf()
                for(j in 0 until m){
                    if(jdel.contains(j)){
                        //Log.d("MyLogMActdel", "jdel contain " + j.toString())
                        deltaj++
                    }else{
                       // Log.d("MyLogMActdel", "jdel not contain " + j.toString())

                        //Log.d("MyLogMActdel", "add" + root_matrix[i][j].toString())

                        //Log.d("MyLogMActdel", i.toString() + (i-deltai).toString())
                       // Log.d("MyLogMActdel", j.toString() + (j-deltaj).toString())
                        //var tempi : Int = i-deltai
                        //var tempj : Int = j-deltaj
                        //var temppair : Pair<Int, Int> = root_matrix[i][j]
                        //templist.add(temppair)
                        //Log.d("MyLogMActdel", "Good Add")
                        //Log.d("MyLogMActdel", tempmatrix[i-deltai].size.toString())
                        tempmatrix[i-deltai][j-deltaj] = root_matrix[i][j]
                        //Log.d("MyLogMActdel", "Good Add")
                    }
                }
            }
        }
        return Triple(tempmatrix,n - idel.size , m - jdel.size)
    }
    //удаление строго доминируемых стратегий
    fun deldominate(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int):Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int>{
        var temptriple : Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> = Triple(root_matrix, n, m)
        var idel:MutableSet<Int> = mutableSetOf<Int>()
        var jdel:MutableSet<Int> = mutableSetOf<Int>()
        var flag = true
        while(flag){
            idel = searchdominate1(temptriple.first, temptriple.second, temptriple.third)
            jdel = searchdominate2(temptriple.first, temptriple.second, temptriple.third)
            if((idel.size == 0) && (jdel.size == 0)){
                flag = false
            }else{
                temptriple = fit_to_size(idel, jdel, temptriple.first, temptriple.second, temptriple.third)
            }
        }

        return temptriple
    }
    //поиск слабо доминируемых стратегий для первого игрока
    fun searchweaklydominate1(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableSet<Int> {
        var tempset: MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
        //Log.d("MyLogMActdom1", "begin")
        for (i in 0..n - 2) {
            if (!tempset.contains(i)) {
                for (k in (i + 1) until n) {
                    //Log.d("MyLogMActdom1", "loop " + i.toString() + " " + k.toString())
                    var flagd1 = true; //все i >= k
                    var flagd2 = true; //все i <= k
                    var flag3 = false; //хотя бы одно равенство
                        for (j in 0 until m) {
                            //Log.d("MyLogMActdom1", "loopj " + j.toString())
                            //var temparr1 : Array<Int> = arrayOf(i, j)
                           //var temparr2 : Array<Int> = arrayOf(k, j)
                            if(root_matrix[i][j].first == root_matrix[k][j].first){
                                flag3 = true
                            }else if (root_matrix[i][j].first < root_matrix[k][j].first)  {
                                flagd1 = false

                            } else  {
                                flagd2 = false

                            }
                        }
                    //Log.d("MyLogMActdom1", "loopjend")

                    if ((!(flagd1 && flagd2)) && flag3) {
                        if (flagd1) {
                            tempset.add(k)
                            //Log.d("MyLogMActdom1", "addk")
                        }
                        if (flagd2) {
                            //Log.d("MyLogMActdom1", "addi")
                            tempset.add(i)
                            //Log.d("MyLogMActdom1", "addi")
                        }
                    }
                }
            }
        }
        //Log.d("MyLogMActdom1", "size "+ tempset.size.toString())
        return tempset
    }
            /*var tempset : MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
        for(i in 1 until n){
            if(!tempset.contains(i)){
                for(k in (i+1)..n ){
                    var flagd1 = true; //все i >= k
                    var flagd2 = true; //все i <= k
                    for(j in 1..m ){
                        var temparr1 : Array<Int> = arrayOf(i, j)
                        var temparr2 : Array<Int> = arrayOf(k, j)
                        if(root_matrix.getValue(temparr1)[0] > root_matrix.getValue(temparr2)[0]){
                            flagd2 = false;
                        }else if (root_matrix.getValue(temparr1)[0] < root_matrix.getValue(temparr2)[0]){
                            flagd1 = false;
                        }
                    }
                    if (flagd1) {
                        tempset.add(k)
                    }
                    else if(flagd2)
                    {
                        tempset.add(i)
                    }
                }
            }
        }
        return tempset*/

        //поиск слабо доминиируемых стратегий для 2 игрока
        fun searchweaklydominate2(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n: Int, m: Int): MutableSet<Int> {
            var tempset: MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
            for (i in 0..m - 2) {
                if (!tempset.contains(i)) {
                    for (k in (i + 1) until m) {
                        var flagd1 = true; //все i >= k
                        var flagd2 = true; //все i <= k
                        var flag3 = false; //хотя бы одно равенство
                        for (j in 0 until n) {
                            //var temparr1 : Array<Int> = arrayOf(j, i)
                            // var temparr2 : Array<Int> = arrayOf(j, k)
                            if(root_matrix[j][i].second == root_matrix[j][k].second){
                                flag3 = true
                            }else if (root_matrix[j][i].second < root_matrix[j][k].second) {
                                    flagd1 = false;
                                //Log.d("MyLogMActdom2", "flag1" + i.toString() + k.toString()+j.toString())
                            } else  {
                                    flagd2 = false;

                                //Log.d("MyLogMActdom2", "flag2" + i.toString() + k.toString()+j.toString())
                            }
                        }
                        if ((!(flagd1 && flagd2)) && flag3) {
                            if (flagd1) {
                                tempset.add(k)
                                //Log.d("MyLogMActdom2", "addk")
                            }
                            if (flagd2) {
                                tempset.add(i)
                                //Log.d("MyLogMActdom2", "addi")
                            }
                        }
                    }
                }
            }
            //Log.d("MyLogMActdom2", "size "+ tempset.size.toString())
            return tempset
        }

        /*var tempset : MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
        for(i in 1 until m){
            if(!tempset.contains(i)){
                for(k in (i+1)..m ){
                    var flagd1 = true; //все i >= k
                    var flagd2 = true; //все i <= k
                    for(j in 1..n ){
                        var temparr1 : Array<Int> = arrayOf(j, i)
                        var temparr2 : Array<Int> = arrayOf(j, k)
                        if(root_matrix.getValue(temparr1)[1] > root_matrix.getValue(temparr2)[1]){
                            flagd2 = false;
                        }else if(root_matrix.getValue(temparr1)[1] < root_matrix.getValue(temparr2)[1]){
                            flagd1 = false;
                        }
                    }
                    if (flagd1) {
                        tempset.add(k)
                    }
                    else if(flagd2)
                    {
                        tempset.add(i)
                    }
                }
            }
        }
        return tempset*/

        //удаление слабо доминируемых стратегий flagplayer = false игрок 1 , true игрок 2
        fun delweaklydominate(
            root_matrix: MutableList<MutableList<Pair<Int, Int>>>,
            n: Int,
            m: Int,
            flagplayer: Boolean,
            strat: Int
        ): Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> {
            var temptriple : Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> = Triple(root_matrix, n, m)
            var idel:MutableSet<Int> = mutableSetOf<Int>()
            var jdel:MutableSet<Int> = mutableSetOf<Int>()
            if (flagplayer) {
                jdel.add(strat)
            } else {
                idel.add(strat)
            }
            temptriple = fit_to_size(idel, jdel, temptriple.first, temptriple.second, temptriple.third)
            return temptriple
        }
        //поиск НЛО стратегий
        fun searchnlo1(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableSet<Int> {
            var tempset1: MutableSet<Int> = mutableSetOf<Int>()
            var tempset2: MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
            var temp : Int = 0
            var flag : Boolean
            for(j in 0 until m){
                flag = true
                for(i in 0 until n){
                    if (flag) {
                        temp = root_matrix[i][j].first;
                        flag = false;
                    }
                    else if(temp < root_matrix[i][j].first)
                        temp = root_matrix[i][j].first;
                }
                for(i in 0 until n){
                    if (temp == root_matrix[i][j].first)
                        tempset1.add(i);
                }
            }
            for(i in 0 until n){
                if(!tempset1.contains(i)){
                    tempset2.add(i)
                }
            }
            return tempset2
        }
    fun searchnlo2(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableSet<Int> {
        var tempset1: MutableSet<Int> = mutableSetOf<Int>()
        var tempset2: MutableSet<Int> = mutableSetOf<Int>() //для вывода окончательный
        var temp : Int = 0
        var flag : Boolean
        for(i in 0 until n){
            flag = true
            for(j in 0 until m){
                if (flag) {
                    temp = root_matrix[i][j].second;
                    flag = false;
                }
                else if(temp < root_matrix[i][j].second)
                    temp = root_matrix[i][j].second;
            }
            for(j in 0 until m){
                if (temp == root_matrix[i][j].second)
                    tempset1.add(j);
            }
        }
        for(j in 0 until m){
            if(!tempset1.contains(j)){
                tempset2.add(j)
            }
        }
        return tempset2
    }
        //удаление НЛО стратегий
        fun delnlo(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int):Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int>{
            var temptriple : Triple<MutableList<MutableList<Pair<Int, Int>>>, Int, Int> = Triple(root_matrix, n, m)
            var idel:MutableSet<Int> = mutableSetOf<Int>()
            var jdel:MutableSet<Int> = mutableSetOf<Int>()
            var flag = true
            while(flag){
                idel = searchnlo1(temptriple.first, temptriple.second, temptriple.third)
                jdel = searchnlo2(temptriple.first, temptriple.second, temptriple.third)
                if((idel.size == 0) && (jdel.size == 0)){
                    flag = false
                }else{
                    temptriple = fit_to_size(idel, jdel, temptriple.first, temptriple.second, temptriple.third)
                }
            }

            return temptriple
        }
        //Поиск равновесия по Нэшу в чистых стратегиях
        fun searchnash(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableSet<Pair<Int,Int>>{
            var tempset1: MutableSet<Pair<Int,Int>> = mutableSetOf<Pair<Int,Int>>() //для первого игрока
            var tempset2: MutableSet<Pair<Int,Int>> = mutableSetOf<Pair<Int,Int>>() //для второго игрока
            var tempset3: MutableSet<Pair<Int,Int>> = mutableSetOf<Pair<Int,Int>>() //пересечение
            var temp : Int = 0
            var flag : Boolean
            for(j in 0 until m){
                flag = true
                for(i in 0 until n){
                    if (flag) {
                        temp = root_matrix[i][j].first;
                        flag = false;
                    }
                    else if(temp < root_matrix[i][j].first)
                        temp = root_matrix[i][j].first;
                }
                for(i in 0 until n){
                    if (temp == root_matrix[i][j].first)
                        tempset1.add(Pair(i,j));
                }
            }
            for(i in 0 until n){
                flag = true
                for(j in 0 until m){
                    if (flag) {
                        temp = root_matrix[i][j].second;
                        flag = false;
                    }
                    else if(temp < root_matrix[i][j].second)
                        temp = root_matrix[i][j].second;
                }
                for(j in 0 until m){
                    if (temp == root_matrix[i][j].second)
                        tempset2.add(Pair(i, j));
                }
            }
            tempset3 = (tempset1 intersect tempset2) as MutableSet<Pair<Int, Int>>

            return tempset3
        }
        //Поиск равновесия по Нэшу в смешанных стратегиях 2*2
        fun searchnashsmesh(root_matrix: MutableList<MutableList<Pair<Int, Int>>>, n : Int, m : Int) : MutableList<Pair<Double,Double>>{//первая пара p вторая пара q
            var tempset1: MutableSet<Pair<Int,Int>> = searchnash(root_matrix, n, m)//равновесие в чистых
            var resset : MutableList<Pair<Double,Double>> = mutableListOf<Pair<Double, Double>>()
            if((m == 2) && (n == 2)){
                when(tempset1.size){
                    4 -> {
                        resset.add(Pair(0.5,0.5))
                        resset.add(Pair(0.5,0.5))
                    }
                    1 -> {
                        var a: Double = 0.0
                        var b: Double = 0.0
                        var c: Double = 0.0
                        var d: Double  = 0.0
                        for(elem in tempset1){
                            when(elem.first){
                                0 -> {
                                    b = 1.0;
                                    a = 0.0;
                                }
                                1 -> {
                                    a = 0.0;
                                    b = 1.0;
                                }
                            }
                            when(elem.second){
                                0 -> {
                                    c = 0.0;
                                    d = 1.0;
                                }
                                1 -> {
                                    d = 1.0;
                                    c = 0.0;
                                }
                            }
                        }
                        resset.add(Pair(a, b))
                        resset.add(Pair(c, d))
                    }
                    3 -> {
                        var a: Double = 0.0
                        var b: Double = 0.0
                        var c: Double = 0.0
                        var d: Double  = 0.0
                        var itemp : Int = 0
                        var jtemp : Int = 0
                        for(elem in tempset1){
                            if(elem.first == 0) itemp++
                            if(elem.second == 0) jtemp++
                        }
                        if (itemp == 1) {
                            b = 1.0;
                            a = 0.0;
                            if (jtemp == 1) {
                                c = 0.0;
                                d = 1.0;
                            }
                            else {
                                c = 1.0;
                                d = 0.0;
                            }
                        }
                        else {
                            b = 0.0;
                            a = 1.0;
                            if (jtemp == 1) {
                                c = 0.0;
                                d = 1.0;
                            }
                            else {
                                c = 1.0;
                                d = 0.0;
                            }
                        }
                        resset.add(Pair(a, b))
                        resset.add(Pair(c, d))
                    }
                    2 -> {
                        var a: Double = 0.0
                        var b: Double = 0.0
                        var c: Double = 0.0
                        var d: Double  = 0.0
                        var itemp : Int = 0
                        var jtemp : Int = 0
                        for(elem in tempset1){
                            if(elem.first == 0) itemp++
                            if(elem.second == 0) jtemp++
                        }
                        when(itemp){
                            0 -> {
                                a = 0.0;
                                b = 1.0;
                                c = 0.5;
                                d = 0.5;
                            }
                            2 -> {
                                a = 1.0;
                                b = 0.0;
                                c = 0.5;
                                d = 0.5;
                            }
                            else -> {
                                when(jtemp){
                                    0 -> {
                                        c = 0.0;
                                        d = 1.0;
                                        a = 0.5;
                                        b = 0.5;
                                    }
                                    2 -> {
                                        c = 1.0;
                                        d = 0.0;
                                        a = 0.5;
                                        b = 0.5;
                                    }
                                    else -> {
                                        var pair1 : Pair<Int,Int> = Pair(0, 0)
                                        var pair2 : Pair<Int,Int> = Pair(0, 0)
                                        var flag = true
                                        for(elem in tempset1){
                                            if(flag) {
                                                pair1 = elem
                                                flag = false
                                            }else{
                                                pair2 = elem
                                            }
                                        }
                                        if(pair1.first == pair1.second){
                                            var temp0: Double = root_matrix[0][0].first.toDouble();
                                            var temp1: Double = root_matrix[1][1].first.toDouble();
                                            var temp2: Double = root_matrix[0][0].second.toDouble();
                                            var temp3: Double = root_matrix[1][1].second.toDouble();
                                            a = temp3 / (temp2 + temp3);
                                            b = temp2 / (temp2 + temp3);
                                            c = temp1 / (temp1 + temp0);
                                            d = temp0 / (temp1 + temp0);
                                        }else{
                                            var temp0: Double = root_matrix[0][1].first.toDouble();
                                            var temp1: Double = root_matrix[1][0].first.toDouble();
                                            var temp2: Double = root_matrix[0][1].second.toDouble();
                                            var temp3: Double = root_matrix[1][0].second.toDouble();
                                            a = temp3 / (temp2 + temp3);
                                            b = temp2 / (temp2 + temp3);
                                            c = temp1 / (temp1 + temp0);
                                            d = temp0 / (temp1 + temp0);
                                        }
                                    }

                                }
                            }
                        }
                        resset.add(Pair(a, b))
                        resset.add(Pair(c, d))
                    }
                }
            }
            return resset
        }


        }