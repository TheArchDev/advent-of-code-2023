package day1

import scala.io.Source

//// Part 1
object Hello extends App{
  var total: Int = 0
  for (line <- Source.fromFile("input.txt").getLines) {
    var digits = line.filter(_.isDigit)
    var newResult =
    total += (digits.head.toString + digits.last.toString).toInt
  }
  println(s"result: $total")
}
