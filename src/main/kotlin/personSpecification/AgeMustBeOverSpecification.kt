package personSpecification

import Specification
import entity.Person

class AgeMustBeOverSpecification(private val age: Int): Specification<Person>() {
    override fun isSatisfiedBy(candidate: Person): Boolean {
        return candidate.age >= age
    }
}