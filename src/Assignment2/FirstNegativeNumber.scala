package Assignment2

import scala.annotation.tailrec

object FirstNegativeNumber extends App {

  val studentMarks = Array(32, 10, 12)
  val position = findFirstNeg(studentMarks)

  /*Tail recursive solution first negative number*/
  def findFirstNeg(numbers: Array[Int]): Option[Int] = {
    var count = 0

    @tailrec
    def find(): Boolean = {
      if (numbers(count) < 0) {
        return true
      } else {
        if (count < numbers.length - 1) {
          count = count + 1
        } else {
          return false
        }
      }
      find()
    }

    val check = find()
    if (check) {
      Some(numbers(count))
    } else {
      None
    }
  }

  print("value of stu : " + position)

}
