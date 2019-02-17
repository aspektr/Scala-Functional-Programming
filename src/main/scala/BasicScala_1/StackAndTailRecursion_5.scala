package BasicScala_1

import scala.annotation.tailrec

object StackAndTailRecursion_5 extends App {


  def factorial(n: Int): Int = {
    if (n == 1) 1
    else {
      println("Computing factorial of " + n + ". It needs factorial of " + (n - 1))
      val res = n * factorial(n - 1)
      println("Computed factorial of " + n)
      res
    }
  }

  factorial(5)
  // this causes stack overflow error
  // factorial(5000)


  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    }

    factorialHelper(n, 1)
  }

  // this works with big number
  println(anotherFactorial(5000))

  // key ingredient is to use a recursive call as the last expression on each code

  // when you need loops, use tail_recursion


  /*
    1. Concatenate a string n times
    2. Fibonacci function, tail recursive
   */

  def concat(aString: String, n: Int): String = {

    @tailrec
    def concatHelper(accumulator: String, aString: String, t: Int): String = {
      if (t <= 1) accumulator
      else concatHelper(accumulator + aString, aString, t - 1)
    }

    concatHelper(aString, aString, n)
  }


  println(concat("Hello! ", 5))


  /*
        _________________________
  n =   | 1| 2| 3| 4| 5| 6| 7| 8|
        -------------------------
  fib = | 1| 1| 2| 3| 5| 8|13|21|
        -------------------------
  */

  def fib(n: Int): Int = {
    @tailrec
    def fibHelper(t: Int, last: Int, nextToLast: Int): Int ={
      if (t >= n) last
      else fibHelper(t+1, last + nextToLast, last)
    }
    if (n<=2) 1
    else fibHelper(2, 1, 1)
  }

  println(fib(9))
}
