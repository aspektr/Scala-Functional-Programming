package OOP_2

object AbstractDataTypes_5 extends App{

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    def eat: Unit = println("Crunch crunch")
  }

  // traits


}
