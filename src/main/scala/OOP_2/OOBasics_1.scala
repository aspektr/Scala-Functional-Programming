package OOP_2

import scala.annotation.tailrec

object OOBasics_1 extends App{

  val person = new Person
  println(person)

  val person2 = new Person2("Alex", 32)


  val person3 = new Person3("Alex", 32)
  println(s"${person3.name} is ${person3.age} years old")

  val person4 = new Person4("John", 21)
  println(s"${person4.name} is ${person4.x}th")

  person4.greet("Angel")
  person4.greet()

  val pushkin   = new Writer("Alexander", "Pushkin", 1799)
  val lermontov = new Writer("Mikhail", "Lermontov", 1814)
  val gogol     = new Writer("Nikolai", "Gogol", 1809)
  val anotherPushkin = new Writer("Alexander", "Pushkin", 1799)

  val onegin = new Novel("Onegin", 1825, pushkin)
  val theHeroOfOurTime = new Novel("The Hero of our time", 1840, lermontov)
  val deadSouls = new Novel("Dead Souls", 1842, gogol)

  println(s"${onegin.name} was written by ${pushkin.fullname}," +
    s" and published in ${onegin.yearOfRelease} when he was at ${onegin.authorAge}")
  println(s"${theHeroOfOurTime.name} was written by ${lermontov.fullname}," +
    s"and published in ${theHeroOfOurTime.yearOfRelease} when he was at ${theHeroOfOurTime.authorAge}")
  println(s"${deadSouls.name} was written by ${gogol.fullname}," +
    s"and published in ${deadSouls.yearOfRelease} when he was at ${deadSouls.authorAge}")

  println(s"Was ${deadSouls.name} written by ${pushkin.fullname}? Of course," +
    s"${if (deadSouls.writtenBy(pushkin)) "yes" else "no"}")

  println(s"Was ${onegin.name} written by ${anotherPushkin.fullname}? Of course," +
    s"${if (onegin.writtenBy(anotherPushkin)) "yes" else "no"}. \nInteresting thing " +
    s"happened. Equality objects is important problem in OOP")

  val newReleaseOnegin: Novel = onegin.copy(1833)
  println(s"New release of ${newReleaseOnegin.name} was puplished at ${newReleaseOnegin.yearOfRelease}")



  val counter = new Counter(4)
  println(s"The value of counter is ${counter.inc().inc().inc(4).count}")

  val anotherCounter = new Counter()
  println(anotherCounter.inc(4).count)

  val counterWithTailRecursion = new anotherRealizationOfCounter(4)
  println(s"The value of recursive counter is ${counterWithTailRecursion.inc.inc.inc(4).count}")


}

class Person


class Person2(name: String, age: Int) //constructor
// class parameters are not fields


class Person3(val name: String, val age: Int) //constructor with fields


class Person4(val name: String, val age: Int) {
  // body
  val x = 2 //field

  println("something") // will be evaluated for each instantiation

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, $name")



}

class Person5(val name: String = "Nata", val age: Int = 19) {

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Nata")  // default parameter does the same
}


  /*
    Novel and Writer

    Writer: first name, surname, year of birth
      - method: fullname

    Novel: name, year of release, author
      - method: authorage
                writtenby(author) => true/false
                copy(new year of release) => new instance of Novel with new year of release


    Counter class
      - receives an int value
      - method current count
      - method to increment/decrement => new Counter
      - overload inc/dec to receive an amount => new Counter
   */

class Writer(val first_name: String, val surname: String, val yearOfBirth: Short) {

  def fullname: String = s"$first_name $surname"
}

/**
  * Novel class
  * @param name - the name of novel
  * @param yearOfRelease
  * @param author
  */
class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {

  def authorAge: Int = yearOfRelease - author.yearOfBirth
  def writtenBy(author: Writer): Boolean = this.author == author
  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}

class Counter(val count: Int = 0) {


    def inc(): Counter = new Counter(count + 1) // immutability
    def dec(): Counter = new Counter(count + 1)
    def inc(n: Int): Counter = new Counter(count + n)
    def dec(n: Int): Counter = new Counter(count + n)

}

class anotherRealizationOfCounter(val count: Int = 0) {


  def inc() = new anotherRealizationOfCounter(count + 1) // immutability
  def dec() = new anotherRealizationOfCounter(count + 1)

  @tailrec
  final def inc(n: Int): anotherRealizationOfCounter = {

    if (n <= 0) this
    else inc.inc(n-1)
  }
  @tailrec
  final def dec(n: Int): anotherRealizationOfCounter = {

    if (n <= 0) this
    else dec.dec(n-1)
  }
}