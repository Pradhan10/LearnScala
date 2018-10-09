package Assignment1
import scala.util.Try

object Testing extends App {

  /*conventional Exception handling in scala*/
  def di(a: Int): Int = {
    try {
      7 / a
    }
    catch {
      case _: ArithmeticException =>
        print("handled")
        9
    }
  }

  //  di(0)

  /*Recommended exception handling in scala*/
  def divAgain(a: Int): Int = {
    Try(10 / a) match {
      case scala.util.Success(value) =>
        print("handled again")
        value
      case scala.util.Failure(_) =>
        print("do that")
        0

    }
  }

  divAgain(0)
}
