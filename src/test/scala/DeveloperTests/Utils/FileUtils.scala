package DeveloperTests.Utils

import scala.io.Source

object FileUtils {

  def getScalaBookAsString(): String = {

    val scalaBook = Source.fromURL(getClass.getResource("/scala_book.txt"))
    val result = scalaBook.getLines.mkString("\n")

    scalaBook.close
    result
  }

}
