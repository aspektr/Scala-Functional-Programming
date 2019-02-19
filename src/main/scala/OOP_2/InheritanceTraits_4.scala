package OOP_2

object InheritanceTraits_4 extends App{

  // single class inheritance
  class Animal {
    val creatureType = "wild"
    def eat = println("namnamnam")
    private def sit = println("no access")
    protected def sleep = println("sleep")
  }

  class Cat extends Animal{
    override def sleep: Unit = println("override protected")
    def some = {
      sleep
      super.sleep
    }
  }

  val cat = new Cat
  cat.eat

  //no available
  //cat.sit
  cat.some
  cat.sleep


  // constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding

  class Dog extends Animal {
    override val creatureType: String = "domestic"
    override def eat: Unit =  println("crunch crunch")
  }

  class SmallDog(override val creatureType: String = "domestic") extends Animal {
    override def eat: Unit =  println("crunch crunch")
  }

  val dog = new Dog
  dog.eat

  val smallDog = new SmallDog("K9")
  println(smallDog.creatureType)

  // type substitution

  val unknownAnimal: Animal = new SmallDog("K9")
  unknownAnimal.eat


  // super

  // preventing overrides final, sealed
}
