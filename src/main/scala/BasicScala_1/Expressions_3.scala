package BasicScala_1

object Expressions_3 extends App {

  val x = 1 + 2 // EXPRESSION (right side)
  println(x)


  println(2 * 3 + 4)
  // + - * / % & | << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable +=3 // also works -= *= /= ...side effects


  //INSTRUCTIONS {DO} VS EXPRESSIONS {VALUE}

  //  IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF expression
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)


  //LOOPS

  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  //while loop never uses in functional programming

  //EVERYTHING in Scala is EXPRESSION!


  val aWeirdValue = {aVariable = 3}  //Unit type === void
  println(aWeirdValue)


  val aWeirdValue2 = aVariable = 3
  println(aWeirdValue2)

  // all things that return Unit have side effects

  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = 0
    if (y>2) "hello" else "goodbye"
  }

  // code block is expression
  // the value of the block is the value of last expression
  // z is not visible being out of block
}
