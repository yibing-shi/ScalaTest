package DeveloperTests

import DeveloperTests.Utils.FileUtils
import DeveloperTests.StringImprovements._
import DeveloperTests.StrArrImprovements._
import org.scalatest._

class StringTests extends FlatSpec with Matchers {

  "String" should "have a row level filter function to support multiple filters" in {

    val file = FileUtils.getScalaBookAsString()
    val res = file.filterLines(l => l.toLowerCase.startsWith("the "))

    res.length should be (392)

  }

  it should "be able to be chain line level filters" in {

    val file = FileUtils.getScalaBookAsString()
    val res = file.filterLines(l => l.toLowerCase.startsWith("the ")).filterLines(l => l.size > 30)

    res.length should be (375)
  }

  it should "also have a word level filter" in {

    val file = FileUtils.getScalaBookAsString()
    val res = file.filterWords(l => l.toLowerCase.startsWith("z"))

    res.length should be (115)
    res.distinct.length should be (40)
  }

  "word level filters" should "be chained to line level filters" in {

    val file = FileUtils.getScalaBookAsString()
    val res = file.filterLines(l => l.toLowerCase.startsWith("the ")).filterWords(l => l.toLowerCase.startsWith("z"))

    res.length should be (14)
    res.distinct.length should be (9)
  }
}
