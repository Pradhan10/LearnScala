package Assignment2

import scala.annotation.tailrec

object FibonacciTailRecursive extends App {

  /*Recursive fibonacci*/

  val check2 = fib2(6)
  val check = fib1(6)
  println(check)

  /*Tail recursion means that we perform recursive call
* in last line after performing all computations, so the
* Stack frame does not needs to be preserved.
* */
  var f = 0
  var s = 1
  var ans = 0

  def fib1(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib1(n - 1) + fib1(n - 2)
  }

  @tailrec
  def fib2(x: Int): Int = x match {
    case 1 => ans
    case _ =>
      if (x > 1) {
        ans = f + s
        //println("The ans : " + ans) /*DEBUG ONLY*/
        val temp = f
        f = s
        s = s + temp
        //println("val x : " + x) /*DEBUG ONLY*/
      } else {
        ans = f + s
      }
      fib2(x - 1)
  }

  println(check2)

  /*Fibonacci using dynamic programming*/

}
