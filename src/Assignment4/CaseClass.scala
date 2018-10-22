package Assignment4

import AtomicTest.AtomicTest._

/*
* Create a case class to represent a Person in an address book,
complete with Strings for the name and a String for contact
information. Satisfy the following tests:
val p = Person("Jane", "Smile",
"jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"
* */


case class Person(val first: String, val last: String, val email: String) {

}

case class Dog(val name: String, val breed: String) {

}

object CaseClass extends App {

  val p = Person("Jane", "Smile",
    "jane@smile.com")
  p.first is "Jane"
  p.last is "Smile"
  p.email is "jane@smile.com"

  /*
  * Create some Person objects. Put the Person objects in a Vector.
Satisfy the following tests:
val people = Vector(
Person("Jane","Smile","jane@smile.com"),
Person("Ron","House","ron@house.com"),
Person("Sally","Dove","sally@dove.com"))
people(0) is
"Person(Jane,Smile,jane@smile.com)"
  * */
  val jane = Person("Jane", "Smile", "jane@smile.com")
  val ron = Person("Ron", "House", "ron@house.com")
  val sally = Person("Sally", "Dove", "sally@dove.com")

  val people = Vector(jane, ron, sally)

  people(0) is
    "Person(Jane,Smile,jane@smile.com)"

  people(1) is
    "Person(Ron,House,ron@house.com)"
  people(2) is
    "Person(Sally,Dove,sally@dove.com)"

  /*
  * First, create a case class that represents a Dog, using a String for
name and a String for breed. Then, create a Vector of Dogs. Satisfy
the following tests:
val dogs = Vector(
 /* Insert Vector initialization */)
dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"
  * */
  val dogs = Vector(Dog("Fido", "Golden Lab"), Dog("Ruff", "Alaskan Malamute"), Dog("Fifi", "Miniature Poodle"))

  dogs(0) is "Dog(Fido,Golden Lab)"
  dogs(1) is "Dog(Ruff,Alaskan Malamute)"
  dogs(2) is "Dog(Fifi,Miniature Poodle)"

}