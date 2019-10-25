package com.elyeproj.daggertwomultibindings.setmultibindings

import org.junit.Test

import java.util.Arrays
import java.util.HashSet

import org.junit.Assert.*

class SetMultibindingsTest {

    @Test
    fun testMyComponent1() {
        val expectedContains = setOf("ABC", "DEF", "GHI")

        val myComponent = DaggerMyComponent.create()
        assertEquals(3, myComponent.setOnestrings().size.toLong())
        assertTrue(myComponent.setOnestrings().containsAll(expectedContains))
    }

    @Test
    fun testMyComponent2() {
        val expectedContains = setOf("123", "456", "789")

        val myComponent = DaggerMyComponent.create()
        assertEquals(3, myComponent.setTwostrings().size.toLong())
        assertTrue(myComponent.setTwostrings().containsAll(expectedContains))
    }
}
