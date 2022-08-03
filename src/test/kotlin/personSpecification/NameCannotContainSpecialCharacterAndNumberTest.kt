package personSpecification

import entity.aPerson

internal class NameCannotContainSpecialCharacterAndNumberTest {
    @org.junit.jupiter.api.Test
    fun `should pass if the name is John`() {
        val person = aPerson().named("John").create()
        assert(NameCannotContainSpecialCharacterAndNumber().isSatisfiedBy(person))
    }

    @org.junit.jupiter.api.Test
    fun `should not pass if the name is John42`() {
        val person = aPerson().named("John42").create()
        assert(!NameCannotContainSpecialCharacterAndNumber().isSatisfiedBy(person))
    }
}