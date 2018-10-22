package Assignment3

/*
Create a class called ClothesWasher with a default constructor and
two auxiliary constructors, one that specifies model (as a String)
and one that specifies capacity (as a Double).
*/


object AuxiliaryConstructor extends App {


}

class ClothesWasher(val model: String, val capacity: Double) {


  /*Auxiliary constructor model*/
  def this(model: String) {
    this(model, 14.032)
  }

  /*Auxiliary constructor capacity*/
  def this(capacity: Double) {
    this("Mv5", capacity)
  }

}

/*class ClothesWasher2(model:String = "Mv5",capacity: Double = 14.032){
  def this
}*/
