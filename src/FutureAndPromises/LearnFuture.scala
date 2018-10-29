package FutureAndPromises

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object LearnFuture extends App {

  /*Call method that returns a Future*/
  val currentTemp = Await.result(computeTemperatureFromString("43"), 5 seconds)

  /*Simple method that returns a Future of type Int Future[]*/
  def computeTemperatureFromString(temp: String): Future[Int] = Future {
    val tempDegrees: Int = temp.toInt
    tempDegrees /*Notice after method return type we wrap all computation inside Future type holder*/
  }

  print(currentTemp)

  /*With onComplete we are no longer blocking for result from Future instead
  * we will receive callback for either a Success or Failure
  * */
  computeTemperatureFromString("53").onComplete {
    case util.Success(value) => println(s"the converted temp is : $value")
    case util.Failure(error) => println(s"Failed with $error")
  }
  Thread.sleep(5000)

}
