package com.elyeproj.daggertwomultibindings.mapmultibindings

import org.junit.Test

import java.math.BigDecimal

import org.junit.Assert.assertEquals

class MapMultibindingsTest {

    @Test
    fun testMyComponenSimpleMap() {
        val myComponent = DaggerMyComponent.create()

        assertEquals(2, myComponent.longsByString().size.toLong())
        assertEquals(100L, myComponent.longsByString().getValue("foo").toLong())
        assertEquals(200L, myComponent.longsByString().getValue("boo").toLong())

        assertEquals(1, myComponent.stringsByClass().size.toLong())
        assertEquals("value for Thing", myComponent.stringsByClass()[Thing::class.java])
    }

    @Test
    fun testMyComponentSimpleProviderMap() {
        val myComponent = DaggerMyComponent.create()
        assertEquals(2, myComponent.providerLongsByString().size.toLong())
        assertEquals(100L, myComponent.providerLongsByString().getValue("foo").get().toLong())
        assertEquals(200L, myComponent.providerLongsByString().getValue("boo").get().toLong())
    }

    @Test
    fun testMyComponentEnumMap() {
        val myComponent = DaggerMyComponent.create()
        assertEquals("value for ABC", myComponent.myEnumStringMap()[MyEnum.ABC])
        assertEquals("value for BigDecimal", myComponent.stringsByNumberClass()[BigDecimal::class.java])
    }
}
