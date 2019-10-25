package com.elyeproj.daggertwomultibindings.subcomponentmultibindings

import org.junit.Test

import java.util.Arrays
import java.util.HashSet

import org.junit.Assert.*

class SubcomponentMultibindingsTest {

    @Test
    fun testMultibindings() {
        val expectedParentSet = setOf("parent string 1", "parent string 2")
        val expectedParentMap = setOf("a", "b")

        val parentComponent = DaggerParentComponent.create()
        assertEquals(2, parentComponent.strings().size.toLong())
        assertTrue(parentComponent.strings().containsAll(expectedParentSet))
        assertEquals(2, parentComponent.stringMap().size.toLong())
        assertTrue(parentComponent.stringMap().keys.containsAll(expectedParentMap))

        val expectedChildSet = setOf(
            "parent string 1", "parent string 2", "child string 3", "child string 4")
        val expectedChildMap = setOf("a", "b", "c", "d")

        val childComponent = parentComponent.childComponent()

        assertEquals(4, childComponent.strings().size.toLong())
        assertTrue(childComponent.strings().containsAll(expectedChildSet))
        assertEquals(4, childComponent.stringMap().size.toLong())
        assertTrue(childComponent.stringMap().keys.containsAll(expectedChildMap))
    }
}
