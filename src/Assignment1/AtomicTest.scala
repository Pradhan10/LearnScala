// AtomicTest.scala
/* A tiny little testing framework, to
display results and to introduce & promote
unit testing early in the learning curve.
To use in a script or App, include:
import com.atomicscala.AtomicTest._
*/
package Assignment1

import java.io.FileWriter

import scala.language.implicitConversions

class AtomicTest[T](val target: T) {
  val errorLog = "_AtomicTestErrors.txt"

  def is(expected: String): Unit = tst(expected) {
    expected.replaceAll("\r\n", "\n") == str
  }

  def is[E](expected: E): Unit = tst(expected) {
    expected == target
  }

  def beginsWith(exp: String): Unit = tst(exp) {
    str.startsWith(
      exp.replaceAll("\r\n", "\n"))
  }

  def tst[E](expected: E)(test: => Boolean) {
    println(target)
    if (!test) {
      val msg = "[Error] expected:\n" +
        expected
      println(msg)
      val el = new FileWriter(errorLog, true)
      el.write(target + msg + "\n")
      el.close()
    }
  }

  def str: String = // Safely convert to a String
    Option(target).getOrElse("").toString
}

object AtomicTest {
  implicit def any2Atomic[T](target: T): AtomicTest[T] =
    new AtomicTest(target)
}