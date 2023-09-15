object multi_inhertance extends App {
  // Define some traits
  trait Animal {
    def speak(): Unit
  }

  trait Walks {
    def walk(): Unit = println("Walking")
  }

  trait Swims {
    def swim(): Unit = println("Swimming")
  }

  // Create a class that mixes in these traits
  class Dog extends Animal with Walks {
    override def speak(): Unit = println("Woof!")
  }

  class Fish extends Animal with Swims {
    override def speak(): Unit = println("Blub blub!")
  }

  class Duck extends Animal with Walks with Swims {
    override def speak(): Unit = println("Quack!")
  }

  val dog = new Dog()
  dog.speak()
  dog.walk()

  val fish = new Fish()
  fish.speak()
  fish.swim()

  val duck = new Duck()
  duck.speak()
  duck.walk()
  duck.swim()


}