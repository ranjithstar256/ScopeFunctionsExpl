package kp.ran.higherorderexamples

/// limit your options

sealed class Result

data class Success(val message: String) : Result()
data class Failure(val errorMessage: String) : Result()

fun processResult(result: Result) {
        when (result) {
            is Success -> println("Operation succeeded: ${result.message}")
            is Failure -> println("Operation failed: ${result.errorMessage}")
        }
    }
//code safty

fun main() {
    val successResult = Success("Data retrieved successfully")
    val failureResult = Failure("Error: Unable to fetch data")

    processResult(successResult)
    processResult(failureResult)
}
