package Assignment1

object Vectors extends App {

  // A Vector holds other objects:
  val v1 = Vector()
  // v1 is Vector()
  val sum_of = Range.inclusive(0, 10)
  print(sum_of.isInclusive)

  /*List and set example*/
  val list = List("12", 12, true, "afasdasa")
  print(list)

  /*Create two vectors and compare*/
  val myvec1 = Vector(12, 32)
  val myvec2 = Vector(12, 32)

  assert(myvec1 == myvec2, "assert failed")

  //myvec1 is myvec2

}
