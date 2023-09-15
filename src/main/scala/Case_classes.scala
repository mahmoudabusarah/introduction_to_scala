object Case_Classes extends App {
  case class Person(var name: String, age: Int)

  // Creating instances of the case class
  var person1 = Person("Alice", 30)
  person1.name= "max"
  var max = person1.name

  print(max)
  /*
  person1.name = "mahmoud"
   person1.age = 20
   */
  val person2 = Person("Bob", 25)

  // Pattern matching
  person1 match {
    case Person(name, age) => println(s"Name: $name, Age: $age")
    case _ => println("Unknown person")
  }

  // Automatic toString method
  println(person1) // Output: Person(Alice,30)

  // Automatic equals method
  println(person1 == person2) // Output: false

}