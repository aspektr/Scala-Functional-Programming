package BasicScala_1

object CallByNameCallByValue_6 extends App{

  def calledByValue(x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name " + x)
    println("by name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /*
    def calledByValue(x: Long): Unit = {
    println("by value " + 1569914838879990)
    println("by value " + 1569914838879990)
  }

  def calledByName(x: => Long): Unit = {
    println("by name " + System.nanoTime())
    println("by name " + System.nanoTime())
  }

   */

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // crash with stack overflow error
  // printFirst(infinite(), 34)

  printFirst(34, infinite())
}
