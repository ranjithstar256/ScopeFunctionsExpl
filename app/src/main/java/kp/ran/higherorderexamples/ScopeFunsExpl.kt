package kp.ran.higherorderexamples

fun main() {
        // "let"
//Executes the given block of code and returns the result of
//the last expression in the block.
    val resultLet = "Hello, Kotlin".let {
        val length = it.length
        println("Length of the string: $length")
        length // This is the value returned by let
    }
        println("Result from let scope function : $resultLet")



























// "run"
//Similar to let, but the context object is available as this.
// It returns the result of the last expression in the block.

        val resultRun = run {
            val message = "Hello, Kotlin"
            println("Original message: $message")

            message.length // This is the value returned by run
        }
        println("Result: $resultRun")
























        /*    "with"
        Similar to run, but it doesn't provide a lambda receiver.
        Instead, you pass the object as an argument, and it becomes the receiver. */

        val message = "Hello, Kotlin"
        val resultWith = with(message) {
            println("Original message: $this")
            this.length // This is the value returned by with
        }
        println("Result: $resultWith")



























        /* "apply" Executes the given block of code on the object itself and returns the object. */
        data class Personn(var name: String, var age: Int)

        val personApply = Personn("John", 30).apply {
            println("Original person: $this")
            age += 1
        }
        println("Updated person: $personApply")

























        /*
        also:
        Similar to apply, but it returns the original object
        instead of the result of the block.*/
        data class Car(var brand: String, var model: String)

        val carAlso = Car("Toyota", "Camry").also {
      ///      println("Original car: $it")
            it.model = "Corolla"
        }
    //    println("Updated car: $carAlso")

    }

