package BasicScala_1

object Strings_8 extends App{

  val str: String = "Hello, World!"

  println(str.charAt(2))
  println(str.substring(7, 12))
  println(str.split("").toList)
  println(str.split(",").toList)
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Hello", "Hi"))
  println(str.toLowerCase)
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println(aNumber)

  println('a' +: aNumberString)
  println(aNumberString :+ 's')

  println(str.reverse)
  println(str.take(2))

  // S interpolators
  val name = "Aleks"
  val age = 12.5f
  val greeting = s"Hello, my name is $name and I'm $age old"
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I'm ${age+1} old"
  println(anotherGreeting)

  // F interpolators
  val speed = 3.2f
  val myth = f"$name%s can eat $speed%2.2f burger per min"
  println(myth)

  // raw interpolator
  println(raw"This is \n newline")
  val s = "This is \n newline"
  println(raw"$s")

}
