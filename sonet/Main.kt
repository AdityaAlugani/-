package com.example.sonet

class Main(var name:String="Aditya",var age:Int=19){
    var st:String?=null
    fun Lend()
    {
        st=if(st==null) "Ngit" else st
        println(st)
    }
}
fun main()
{
    var obj=Main();
    //obj.st="Aditya"
    //obj.Lend()
    var n1:Float=2.4F
    var n2:Double=22/7.0
    var st:String="Ngit"
    var n3:Int=3
    println("$n1 $n2 $n3 $st")
}