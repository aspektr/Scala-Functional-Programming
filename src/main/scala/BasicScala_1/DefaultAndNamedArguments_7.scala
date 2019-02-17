package BasicScala_1

import scala.annotation.tailrec

object DefaultAndNamedArguments_7 extends App{

  @tailrec
  def trFact(n: Int, acc: Int): Int =
    if (n<=1) acc
    else trFact(n-1, acc * n)

  println(trFact(5, 1))

  @tailrec
  def trFactWithDefaultValue(n: Int, acc: Int = 1): Int =
    if (n<=1) acc
    else trFactWithDefaultValue(n-1, acc * n)

  println(trFactWithDefaultValue(5))

  println(trFactWithDefaultValue(5, acc = 5))
}
