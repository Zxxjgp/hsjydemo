package test.ioc.hsjy.test

import org.omg.CORBA.Object


open class Person(name:String){
    /**次级构造函数**/
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
        println("你会在哪里等着我呢")
        println(name)
        println(age)
    }

    constructor(name:String,age:Int,sex: Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
        println("你会在哪里等着我呢")
        println(name)
        println(sex)
        println(age)
    }
}
class Student:Person{

    /**次级构造函数**/
    constructor(name:String,age:Int,no:String,score:Int,sex: Int):super(name,age,sex){
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}

open class Zhoyanli{
    open fun test(){
        println("我已经毕业了")
    }
}

class Jhuahua:Zhoyanli(){
    override fun test() {
        println("我咋横渡大学")
    }
}



interface Foo {
    val count: Int
}

class Bar1(override val count: Int) : Foo{
    fun test(){
        println(count)
    }
}

class Box<T>(t:T){
    var value =t
}

class Bar2 : Foo {
    override var count: Int = 0
}

fun <T> doprint(content: T){
    when(content){
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        is Double -> println("你说你输入的数字是多少$content")
        else -> println("T 不是整型，也不是字符串")
    }
}

class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

fun set(list: List<String>){
    //int
    val intSet:  HashSet<String> = HashSet(list) //list的去重方式
    println(intSet)
    val sortedIntegers: java.util.TreeSet<Int> = sortedSetOf(11, 0, 9, 11, 9, 8)
    println(sortedIntegers)


}
fun list() {
    var list = listOf<String>()
    var notNull = listOfNotNull("1", "2", "3")
    var nonNulls: List<String> = listOfNotNull<String>(null, "a", "b", "c")

    var intList: List<Int> = listOf(1, 2, 3)
    var emptyList: List<String> = emptyList<String>()
    var doubleList: ArrayList<Double> = arrayListOf(84.88, 100.25, 999.99)
    println(intList)
    println(doubleList)
    println(emptyList)
    (nonNulls as java.util.ArrayList).addAll(arrayOf("x", "y"))


    /**
     * 读写数组需要用MutableList<T>显式修饰
     */
    var stringList:MutableList<String> = ArrayList()
    stringList.add("zhangsan")

}
fun map(){
    var map = HashMap<String,String>()
    map["key"] = "秦朗"
    map["key1"] = "小白"
    println(map.get(key = "key1"))
    val map1= mapOf<Int, String>(1 to "bookA", 2 to "bookB", 3 to "bookC")
    println(map1[1])
    val hashMap = hashMapOf(1 to "bookA", 2 to "bookB")
    println(hashMap[2])
}

/*********************enum start*************************/
enum class Color(i: Int) {
    RED(0xFF0200),GREEN(0xFF0200),YELLOW(0xFF0200),WHITE(0xFF0200), ovel(100), rectangle(200),BLUE(52)
}
/*********************enum end*************************/
open class A(x: Int){
    public open val y = x
}

interface B{
    fun name(){
        println("123123")
    }
}
class C{
    private fun foo() = object {
        var str : String = "x"
    }
    fun publicFoo() = object {
        var str : String = "x"
    }
    fun bar(): String {
        var  x1 = foo().str
        var x2=publicFoo().toString()
        var x3 = "${x1} $x2"
        println(x3)
        return x1+x2
    }
}

object Site{
    var name: String = "秦朗"
    var age: Int = 45
}

class Sites {
    var name = "菜鸟教程"
    object DeskTop{
        var url = "www.runoob.com"
        fun showName(){
            print("desk legs name") // 错误，不能访问到外部类的方法和变量
        }
    }
}


class MyCLass{
    companion object Factory{
        fun create(): MyCLass = MyCLass()
    }
}

class MyClass {
    companion object {
    }
}

val x = MyClass.Companion
//委托

interface funFoo{
    fun foo()
}
class BaseImpl(x: Int):funFoo{
    override fun foo() {
        println(x)
    }

}


// 测试
fun main(args: Array<String>) {
/*    val result = "Hello World".takeIf {
        it.length > 1
    }

    println(result)*/
    val x = MyCLass.Factory.create()
    println(x)

/*
    val box: Box<Int> = Box<Int>(1)
    println(box.value)

    var boxInt = Box<Int>(10)
    var boxString = Box<String>("Runoob")

    println(boxInt.value)
    println(boxString.value)

    fun <T> boxIn(value: T) = Box(value)

// 以下都是合法语句
    val box4 = boxIn<Int>(1)
    println(box4.value)
    val box5 = boxIn(1)*/
/*
    doprint(55.01)
    doprint("hello word!")

    doprint('w')

    sort(setOf<Int>(1,2,3,89,2,56))*/
/*    val list = arrayListOf<String>("Hello", "World","World")
    println(list[0])
    set(list)*/

 //   val arr = arrayOf("1",2,3,4)
/*
    arr.reverse()

    println(arr.size)*/
/*    println(arr.component1())
    println(arr.component2())
    println(arr.component3())
    println(arr.component4())*/
   // map()
   // println(Color.GREEN)
  /*  var color:Color=Color.WHITE

    println(Color.values())
    println(Color.valueOf("RED"))
    println(color.name)
    println(Color(3))*/

/*    val a: A = object : A(1), B{

    }
    println(a.y)

    val site = object {
        val name:String ="菜鸟驿站"
        val URL: String ="www.baidu.com"
    }
    println(site.URL)*/
/*    val c = C()
    c.bar()*/
/*    var a =Site
    var b =Site
    println(a.age)
    b.age=700
    println(a.age)*/
/*
    var  sites = Sites()
    println(sites.name)
    println(Sites.DeskTop.url)
    Sites.DeskTop.showName()*/
}