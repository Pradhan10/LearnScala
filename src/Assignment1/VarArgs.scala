package Assignment1

;

object VarArgs extends App {

  /*Class arguments 1*/
  val fam1 = new Family("Mom", "Dad", "Sally", "Dick")
  assert(fam1.familySize() == 4)
  /*Class arguments 2 Atomic scala page 142*/
  val fam2 = new Family("Mom", "Dad")
  val check = new Cups(new Cup2(23), "This much")
  assert(fam2.familySize() == 2)

  class Family(args: String*) {
    def familySize(): Int = {
      var count = 0
      for (_ <- args) {
        count += 1
      }
      count
    }
  }

  class FamilyExtended(Dad: String, Mom: String, args: String*) {
    def familySize(): Int = {
      var count = 0
      for (_ <- args) {
        count += 1
      }
      count
    }
  }

  /*Class as argument to another class*/
  class Cup2(var percentFull: Int) {
    val whichCup: String = "This cup is " + percentFull + " full"

    def getPercentFill: Int = {
      percentFull
    }

    def setPercentFull(newPercentFull: Int): Unit = {
      percentFull = newPercentFull
    }
  }

  class Cups(one: Cup2, two: String) {
    def printFull(): Unit = {
      println(one.whichCup)
    }
  }

  check.printFull()
}
