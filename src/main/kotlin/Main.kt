import entity.Person
import personSpecification.AgeMustBeOverSpecification
import personSpecification.NameCannotContainSpecialCharacterAndNumber

fun main() {
    val ageMustBeOver18Specification = AgeMustBeOverSpecification(18)

    val nameCannotContainSpecialCharacterAndNumber = NameCannotContainSpecialCharacterAndNumber()

    val person = Person("John", 18)
    println(ageMustBeOver18Specification.isSatisfiedBy(person))
    println(nameCannotContainSpecialCharacterAndNumber.not().isSatisfiedBy(person))
    println(
        nameCannotContainSpecialCharacterAndNumber
            .and(ageMustBeOver18Specification)
            .isSatisfiedBy(person)
    )
}