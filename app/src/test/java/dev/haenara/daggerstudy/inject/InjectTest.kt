package dev.haenara.daggerstudy.inject

import org.junit.Assert.*
import org.junit.Test

class InjectTest {
    @Test
    fun testInjection() {
        val component: PersonComponent =
            DaggerPersonComponent.create()
        val personA: PersonA = component.getPersonA()
        println("${personA.name} ${personA.age}")

        val personB: PersonB = PersonB()
        DaggerPersonComponent.create().inject(personB)
        assertEquals("Haenara", personB.name)

        assertEquals(31, personB.age)
    }
}