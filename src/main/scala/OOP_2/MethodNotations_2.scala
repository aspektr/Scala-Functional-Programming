package OOP_2

object MethodNotations_2 extends App{

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String): Boolean = movie == favoriteMovie


    def hangOutWith(person: Person): String = s"${this.name} is " +
      s"hanging out with ${person.name}"


    def +(person: Person): String = s"${this.name} is " +
      s"hanging out with ${person.name}"


    def unary_! : String = s"$name, what the heck?"


    def isAlive: Boolean = true


    def apply(): String = s"Hi, my name is $name"
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))

  // infix or operator notation
  println(mary likes "Inception")

  val tom = new Person("Tom", "FightClub")
  println(mary hangOutWith tom)
  println(mary + tom)

  println(1.+(2)) // all operators are methods

  // prefix notations
  val x = -1
  val y = 1.unary_-

  println(x == y)

  //unary_ prefix works only with - + ~ !

  println(!mary)
  println(mary.unary_!)


  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)


  // apply
  println(mary.apply())
  println(mary())


  /*
    1. overload the + operator
      mary + "the rockstar"  => new person "Mary (the rockstar)"
    2. add an age to the person class
       add a unary + operator => new person wih the age + 1
       +mary => mary with age + 1
    3. add a "learns" method => "Mary learns Scala"
       add a "learnsScala" method, calls "learns" method with "Scala" parameter
       use it in postfix notation
    4. overload apply method
       mary.apply(2) => "Mary watched Inception 2 times"
   */

  class Person2(val name: String, favoriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie


    def hangOutWith(person: Person2): String = s"${this.name} is " +
      s"hanging out with ${person.name}"


    def +(person: Person2): String = s"${this.name} is " +
      s"hanging out with ${person.name}"


    def unary_! : String = s"$name, what the heck?"


    def isAlive: Boolean = true


    def apply(): String = s"Hi, my name is $name"


    def +(nickname: String): Person2 = new Person2(s"${this.name} ($nickname)", favoriteMovie)


    def unary_+ : Person2 = new Person2(name, favoriteMovie, age + 1)


    def learns(subject: String): String = s"$name learns $subject"


    def learnsScala: String = learns("Scala")

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }


  val katy = new Person2("Mary", "Inception")

  println((katy + "rockstar").name)
  println((+katy).age)
  println(katy learns "Scala")
  println(katy learnsScala)
  println(katy(2))

}
