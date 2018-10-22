package Assignment3

/*
* Make a class Dimension that has an integer field height and an
integer field width that can be both retrieved and modified from
outside the class. Satisfy the following tests:
val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19
* */


object ClassExample extends App {

  val c = new Dimension(5, 7)

  class Dimension(var height: Int, var width: Int) {

  }

  assert(c.height == 5, "err")
  c.height = 10
  assert(c.height == 10, "err")
  c.width = 19
  assert(c.width == 19, "err")


}
