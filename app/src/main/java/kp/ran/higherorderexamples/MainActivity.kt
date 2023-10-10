package kp.ran.higherorderexamples

import android.icu.number.Precision.increment
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kp.ran.higherorderexamples.MainActivity.Companion.decrement
import kp.ran.higherorderexamples.MainActivity.Companion.increment
import kp.ran.higherorderexamples.ui.theme.HigherOrderExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HigherOrderExamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Counter()
                }
            }
        }
    }

    @Composable
    fun Counter() {
        var count by remember { mutableStateOf(0) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Count: $count", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),

                ) {
                CounterButton("Increment") {
                    // count++

                    increment(count)
                }

                CounterButton("Decrement") {
                    // count--
                    decrement(count)

                }

                val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

                Text(text = "\n $numbers \n")
            }
        }
    }

    @Composable
    fun CounterButton(label: String, onClick: () -> Unit) {

        Button(
            onClick = onClick,
            modifier = Modifier
                .padding(8.dp)
                .height(50.dp)
                .fillMaxWidth()
        ) {

            Text(label + "")
        }
    }

    companion object {
        /// this does not depends on the object of a particular
        /// class!
        // some static data can be placed inside so that we can use it from
        // anywhere inside this class
        // if we use obj of a class , data varies based on
        // to which class we created obj

        // but companion obj variables are always same !
        // kind of a static

        /// for example
        // student's class variable will be changing based on different
        // students object but
        // for all the students , school name is same !
        // school name can be put inside companion object

        fun increment(value: Int): Int {
            return value + 1
        }

        fun decrement(value: Int): Int {
            return value - 1
        }
    }
}
/// Companion object
///   Student s , s1 ,s3 = name = abc , s1= xyz // school name = always
