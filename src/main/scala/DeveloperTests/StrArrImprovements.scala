package DeveloperTests

object StrArrImprovements {

  implicit class StrArrImprovementsImpl (arr: Array[String]) {
    def filterLines (f: String => Boolean) = arr.filter(f)
    def filterWords (f: String => Boolean) = arr.flatMap(_.split(" ")).filter(f)
  }
}
