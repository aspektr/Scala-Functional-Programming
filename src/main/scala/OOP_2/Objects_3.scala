package OOP_2

object Objects_3 extends App{

  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")

  object Person { // type + its only instance
    // static or class level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    def some(x: Int): Unit = println(x)

    //factory method
    def from(mother: Person, father: Person): Person = new Person("Bobby")
    def apply(mother: Person, father: Person): Person = new Person("Bobby")

  }

  class Person(name: String = "noname") {
    // instance level functionality
  }

  // CLASS + OBJECT = COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  Person.some(100)

  val mary = Person
  val katy = Person

  println(mary == katy)

  val peter = new Person
  val john = new Person

  println(peter == john)

  val sam = new Person("Sam")
  val lisa = new Person("Lisa")

  val bobbie = Person.from(sam, lisa)
  val bobbie2 = Person.apply(sam, lisa)
  val bobbie3 = Person(sam, lisa)




}
