package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var IsJava = false
        for(i in 1 until 10000 step 1 ){
            EulerKotlin().sumOfMultiples()
        }

        Java.setOnClickListener{IsJava = true
            Language.text = "Java"
        }
        Kotlin.setOnClickListener{IsJava = false
            Language.text = "Kotlin"
        }

        KotlinSum.setOnClickListener {if(!IsJava){
            ShowSolution(EulerKotlin().sumOfMultiples())
        }else ShowSolution(EulerJava().SumOfMultiples()) }

        KotlinPrime.setOnClickListener{if(!IsJava){
            ShowSolution(EulerKotlin().primeFactor())
        } else ShowSolution(EulerJava().PrimeFactor())
        }

        KotlinFibonacci.setOnClickListener{if(!IsJava){
            ShowSolution(EulerKotlin().fib())
        } else ShowSolution(EulerJava().Fib())
        }

        KotlinPalindrome.setOnClickListener{if(!IsJava){
            ShowSolution(EulerKotlin().palindrome())
        } else ShowSolution(EulerJava().Palindrome())
        }
        KotlinSmallest.setOnClickListener{if(!IsJava){
            ShowSolution(EulerKotlin().smallest())
        }else ShowSolution(EulerJava().smallest(20))
        }

        /*JavaPrime.setOnClickListener{ShowSolution(EulerJava().PrimeFactor())}
        Kotlin.setOnClickListener{ShowSolution(EulerJava().Fib())}
        JavaPalindrome.setOnClickListener{ShowSolution(EulerJava().Palindrome())}
        JavaSmallest.setOnClickListener{ShowSolution(EulerJava().smallest(20))}*/
    }
    fun ShowSolution (result : Long?){
        ResultText.text = result.toString()
    }

    /*fun KotlinEulerMultiply(view: View) {
        EulerKotlin().SumOfMultiples()
    }

    fun KotlinEulerPrime(view: View) {
        EulerKotlin().PrimerFactor()
    }

    fun KotlinEulerFib(view: View) {
        EulerKotlin().PrimerFactor()
    }

    fun KotlinEulerSmall(view: View) {
        EulerKotlin().Smallest(20)
    }

    fun KotlinEulerPalindrome(view : View) {
        ShowSolution(EulerKotlin().Palindrome())
    }

    fun JavaEulerMultiply(view: View) {
        EulerJava().SumOfMultiples()
    }

    fun JavaEulerPrime(view: View) {
        EulerJava().PrimeFactor()
    }

    fun JavaEulerFibonacci(view: View) {
        EulerJava().Fib()
    }

    fun JavaEulerSmallest(view: View) {
        EulerJava().smallest(20)
    }

    fun JavaEulerPalindrome(view: View) {
        EulerJava().Palindrome()
    }*/
}
