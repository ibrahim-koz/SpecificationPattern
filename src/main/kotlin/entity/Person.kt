package entity

data class Person(val name: String, val age: Int)

class aPerson {
    private var name = "Foo"
    private var age = 31

    fun named(name: String): aPerson {
        this.name = name
        return this
    }

    fun inAge(age: Int): aPerson {
        this.age = age
        return this
    }

    fun create(): Person {
        return Person(name, age)
    }
}