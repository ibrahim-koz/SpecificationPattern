package personSpecification

import Specification
import entity.Person
import java.util.regex.Pattern

class NameCannotContainSpecialCharacterAndNumber : Specification<Person>() {
    private val p: Pattern = Pattern.compile("[^A-Za-z]")

    override fun isSatisfiedBy(candidate: Person): Boolean {
        return !p.matcher(candidate.name).find()
    }
}