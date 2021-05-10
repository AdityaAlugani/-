package com.example.test

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun main() {
        var ar=mutableListOf("Aditya","2","true","4","5")
        ar.add("1")
        var dic=mutableMapOf(1 to "Aditya",2 to "Ngit")
        dic.put(3,"2nd")
        dic.forEach(){k,v->
            println("$k->$v")
        }
        Printelements(ar)
    }
    fun Printelements(ar:List<String>)
    {
        ar.forEach(){i->
            println(i)
        }
    }


}