package DeveloperTests

object StringImprovements {

  implicit class StringImprovementsImpl (s: String) {

    def filterLines(f : String => Boolean) : Array[String] = {
      s.split("\n").filter(f)
    }

    def filterWords(f : String => Boolean) : Array[String] = {
      s.split("\n").flatMap(_.split(" ")).filter(f)
    }
  }

}
