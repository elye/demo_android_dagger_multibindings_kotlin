package com.elyeproj.daggertwomultibindings.emptymultibindings

import org.junit.Test

import java.util.Arrays
import java.util.HashSet

import org.junit.Assert.*

class EmptyMultibindingsTest {
    @Test
    fun testMultibindings() {
        val parentComponent = DaggerParentComponent.create()
        assertEquals(0, parentComponent.strings().size.toLong())
        assertEquals(0, parentComponent.stringMap().size.toLong())

        val expectedChildSet = HashSet(listOf("child string 3", "child string 4"))
        val expectedChildMap = HashSet(listOf("c", "d"))

        val childComponent = parentComponent.childComponent()

        assertEquals(2, childComponent.strings().size.toLong())
        assertTrue(childComponent.strings().containsAll(expectedChildSet))
        assertEquals(2, childComponent.stringMap().size.toLong())
        assertTrue(childComponent.stringMap().keys.containsAll(expectedChildMap))
    }
}