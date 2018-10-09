package Assignment2

object JoinStringsByDelimiter extends App {

  val strArray: Array[String] = Array("java", "python", "scala", "haskell", "lisp", "smalltalk")
  val joinedString = joinStrings(strArray, ",")

  /*Program to join all strings in given array with passed delimiter*/
  def joinStrings(arr: Array[String], delimiter: String): String = {
    var count = 0
    var result = ""

    def tail(): String = {
      if (count == arr.length) {
        return result
      } else {
        if (count == arr.length - 1) {
          result += arr(count)
        } else {
          result += arr(count) + delimiter
        }
        count = count + 1
      }
      tail()
    }

    tail()
    result
  }

  println(joinedString)

}
