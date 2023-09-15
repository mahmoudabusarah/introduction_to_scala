object Mixins extends App {
  // Define a trait for logging
  // Define a trait for animals that can move
  trait Movable {
    def move(): Unit
  }

  // Define a trait for animals that can make a sound
  trait SoundMaker {
    def makeSound(): Unit
  }

  // Create classes for specific types of animals
  class Dog(name: String) extends Movable with SoundMaker {
    def move(): Unit = {
      println(s"$name is running.")
    }

    def makeSound(): Unit = {
      println(s"$name says Woof!")
    }
  }

  class Bird(name: String) extends Movable with SoundMaker {
    def move(): Unit = {
      println(s"$name is flying.")
    }

    def makeSound(): Unit = {
      println(s"$name is chirping.")
    }
  }

  // Create an instance of Dog and Bird
  val dog = new Dog("Buddy")
  val bird = new Bird("Robin")

  // Call methods defined in the traits
  dog.move()
  dog.makeSound()

  bird.move()
  bird.makeSound()


}