package Assignment5

import Assignment1.AtomicTest._

object MapReduce extends App {

  /*
Modify SimpleMap.scala so the anonymous function multiplies
each value by 11 and adds 10. Satisfy the following tests:
val v = Vector(1, 2, 3, 4)
v.map(/* Fill this in */) is
Vector(21, 32, 43, 54)
 */
  // SimpleMap.scala
  val v = Vector(1, 2, 3, 4)
  v.map(n => 10 + (n * 11)) is Vector(21, 32, 43, 54)

  /*Question 2
  * Can you replace map with foreach in the above solution? What happens? Test the result.
  * ANSWER => No we cannot replace as the below code when tested shows error, however printing works correctly
  * */
  val vMap = Vector(1, 2, 3, 4)
  /*Question 4
  *
  * Rewrite Reduce.scala using for loops
  * */
  // Reduce.scala
  val vReduce = Vector(1, 10, 100, 1000)
  //  vMap.foreach(num => (num*11) + 10) is Vector(11, 22, 33, 44)

  /*Question 3
  * Rewrite the solution for the previous exercise using for. Was this
  * more or less complex than using map? Which approach has the
  * greater potential for errors?
  * ANSWER => for was more complex and error prone, we should let compiler do the job whenever possible
  * */
  var curr = 1
  vReduce.reduce((sum, n) => sum + n) is 1111
  // Using for loop
  var sum = 0
  for (ele <- vReduce) sum + ele


  /*Question 5
  *
  * Use reduce to implement a method sumIt that takes a variable
  * argument list and sums those arguments. Satisfy the following
  * tests: sumIt(1, 2, 3) is 6
  * sumIt(45, 45, 45, 60) is 195
  * */
  def sumIt(nums: Int*): Int = {
    nums.reduce((sum, n) => sum + n)
  }

  sumIt(45, 45, 45, 60) is 195
}
