package Assignment2

import scala.annotation.tailrec

object ArrayPos extends App {

  val arr = Array(12, 43, 121, 121, 121, 10, 121)
  val ans = find1(arr, 121)
  val ans2 = find2(arr, 121)

  println(ans)

  /*Simple solution*/
  def find1(numbers: Array[Int], num: Int): Option[Int] = {

    if (numbers.contains(num)) {
      var index = 0

      def findFirstIndexOf(findThis: Int): Int = findThis match {
        case 0 => index
        case _ =>
          for (i <- numbers.indices) {
            //println("iteration i : "+i) /*DEBUG ONLY*/
            if (numbers(i).equals(num)) {
              //println("numbers(i) "+numbers(i)+" equals : "+num+" val of i :"+i) /*DEBUG ONLY*/
              index = i
              return index
            }
          }
          index
      }

      Some(findFirstIndexOf(num))
    } else {
      None
    }
  }

  /*  Tail recursive solution*/
  def find2(numbers: Array[Int], num: Int): Option[Int] = {
    if (numbers.contains(num)) {
      var count = 0

      @tailrec
      def findPosRecursively(): Int = {
        if (numbers(count).equals(num)) {
          return count
        } else {
          count = count + 1
        }
        findPosRecursively()
      }

      Some(findPosRecursively())
    } else {
      None
    }
  }

  println("Tail recursive : " + ans2)
}
