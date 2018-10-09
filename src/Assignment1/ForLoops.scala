package Assignment1

object ForLoops extends App {

  var evens = 0
  var odds = 0
  for (i <- 0 to 10) {
    if (i % 2 == 0) {
      evens += i
    } else {
      odds += i
    }
  }


  assert(evens == 30, "Assert even failed")
  assert(odds == 25, "Assert odd failed")
  assert(odds + evens == 55, "Assert odd-even sum failed")

}
