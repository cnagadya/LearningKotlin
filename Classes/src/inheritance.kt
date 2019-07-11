import java.time.LocalDate

fun main() {
    val doe = Permanent()
    doe.name = "Joe Doe"
    val smith = Temporary()
    smith.name = "Anon Smith"
}

//open bse all classes are public & final by default
open class Employee {
    var name = ""
    var startDate = LocalDate.parse("2019-01-01")

}

class Permanent : Employee() {
    // stuff specific to permanent employees

}

class Temporary : Employee() {
    // stuff specific to temporary employees

}


