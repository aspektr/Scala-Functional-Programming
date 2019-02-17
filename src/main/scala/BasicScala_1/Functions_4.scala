package BasicScala_1

import scala.annotation.tailrec

object Functions_4 extends App{

  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("Hello", 3))


  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction)


  def aRepeatedFunctions(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunctions(aString, n-1)
  }

   println(aRepeatedFunctions("Hello", 3))

  // WHEN YOU NEED LOOPS USE RECURSION

  // compiler can infer type for function with exception for recursive f
  def someFunction() = "str"


  // function with side effects always return Unit type
  def functionWithSideEffects(aString: String) = {}


  // auxiliary function
  def aBigFunction(a: Int, b: Int): Char = {
    def aSmallFunction(z: Char) = 'g'

    aSmallFunction('d')
  }


  def aFactorial(n: Int): Int = {
    if (n == 1) n
    else n * aFactorial(n-1)
  }
  println(aFactorial(5))


  def aFibonacci(n: Int): Int = {
    if(n<=2) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
  }
  println(aFibonacci(8))


  def aTestIsPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t == 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }

    isPrimeUntil(n/2)
  }

  println(aTestIsPrime(120))
  println(aTestIsPrime(2003))
  println(true && false)
}
