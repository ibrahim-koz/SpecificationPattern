package personSpecification

import entity.aPerson
import org.junit.jupiter.api.Assertions.*

internal class AgeMustBeOverSpecificationTest {
    @org.junit.jupiter.api.Test
    fun `should pass if the person is over 18 given the age is 20`() {
        val person = aPerson().inAge(20).create()
        assert(AgeMustBeOverSpecification(18).isSatisfiedBy(person))
    }

    @org.junit.jupiter.api.Test
    fun `should not pass if the person is over 18 given the age is 16`() {
        val person = aPerson().inAge(16).create()
        assert(!AgeMustBeOverSpecification(18).isSatisfiedBy(person))
    }
}