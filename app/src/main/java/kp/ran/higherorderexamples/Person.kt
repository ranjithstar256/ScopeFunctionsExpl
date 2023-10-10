package kp.ran.higherorderexamples

import androidx.compose.ui.text.capitalize
import java.util.Locale

class Person {
    var name = "Something"
    var age = 33
}

fun main() {
    val person = Person()

   val newAge = with(person){
 //       println(name)
 //       println(age)
        age+6
    }

   // println(newAge)

  val p=  person.apply {
        name= "Farhaan"
        age=16
    }
   // println(p.name+"\n"+p.age)


    //also

    val numberList : MutableList<Int> = mutableListOf(1,2,3)

  /*  println("the list elements are : $numberList")
    numberList.add(4)
    println("the list elements after add : $numberList")
    numberList.remove(2)
    println("the list elements after remove : $numberList")*/

   val duplicateList= numberList.also {// it
   ///     println("the list elements are : $it")
        it.add(4)
      //  println("the list elements after add : $it")
       it.remove(2)
        //println("the list elements after remove : $it")
    }
    //println(numberList)
    //println(duplicateList)


    //let
    val name : String? = null
    /*println(name!!.reversed())
    println(name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() })
    println(name.length)*/

   var len= name?.let {// it
        println(it!!.reversed())
        println(it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() })
        println(it.length)
        it.length

    }

    println(len)




    //run // it is a combo of with and let

   // val person2 : Person? = null

    val age2 = person?.run {  // this   //result
        println(name)
        println(age)
        age+5
    }
    println(age2)

    // create a new class - put all these scope fns expls and show me
    // put it in a separately class

    // bring your own example for each scope function and show me

}


