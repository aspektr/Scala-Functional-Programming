package BasicScala_1

object ValuesVariablesTypes_2 extends App{


  // declaring value
  val x: Int = 13
  println(x)


  //val can't be reassigned
  // VALS ARE IMMUTABLE
  //x = 17


  // compiler can infer types
  val y = 23


  val aString: String = "Hello";

  // BASIC TYPES
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aInt: Int = 7
  val aShort: Short = 32500   // 2 bytes
  val aLong: Long = 435345345L // 8 bytes
  val aFloat: Float = 4.5f
  val aDouble: Double = 3.14


  //VARIABLES
  var aVariable: Int = 3

  aVariable = 5 // side effects


}
