package com.elyeproj.daggertwomultibindings.unknownmapkeymultibindings

import org.junit.Test

import org.junit.Assert.assertEquals

class UnknownMapKeyMultibindingTest {

    @Test
    fun testMyComponent() {
        val myComponent = DaggerMyComponent.create()
        assertEquals(2, myComponent.runtimeKeyMapMultiBinding().size.toLong())
        println(myComponent.runtimeKeyMapMultiBinding())
    }
}
