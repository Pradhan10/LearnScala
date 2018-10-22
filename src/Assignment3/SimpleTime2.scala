package Assignment3

import AtomicTest.AtomicTest._

/*
* Modify your SimpleTime solution to use default arguments for
minutes (see Named & Default Arguments). Satisfy the following
tests:
* */


class SimpleTime(val hours: Int, val minutes: Int = 0) {

  def this(hrs: Int) {
    this(hrs, 0)
  }

  def subtract(aTime: SimpleTime): SimpleTime = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if (h < 0) {
      new SimpleTime(0, 0)
    } else if (m >= 0) {
      new SimpleTime(h, m)
    } else {
      new SimpleTime(h - 1, m + 60)
    }
  }
}

object SimpleTime2 extends App {

  val t1 = new SimpleTime(10, 30)
  val t2 = new SimpleTime(9, 30)
  val st = t1.subtract(t2)
  st.hours is 1
  st.minutes is 0
  val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
  st2.hours is 0
  st2.minutes is 45
  val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))
  st3.hours is 0
  st3.minutes is 0

  /* OUTPUT_SHOULD_BE
  1
  0
  0
  45
  0
  0
  */

  val anotherT1 =
    new SimpleTime(10, 30)
  val anotherT2 = new SimpleTime(9)
  val anotherST =
    anotherT1.subtract(anotherT2)
  anotherST.hours is 1
  anotherST.minutes is 30
  val anotherST2 = new SimpleTime(10).
    subtract(new SimpleTime(9, 45))
  anotherST2.hours is 0
  anotherST2.minutes is 15

  /*Modify your solution for Exercise 5 to use an auxiliary constructor.
  Again, satisfy the following tests:
  */
  val auxT1 = new SimpleTime(10, 5)
  val auxT2 = new SimpleTime(6)
  val auxST = auxT1.subtract(auxT2)
  auxST.hours is 4
  auxST.minutes is 5
  val auxST2 = new SimpleTime(12).subtract(
    new SimpleTime(9, 45))
  auxST2.hours is 2
  auxST2.minutes is 15


}
