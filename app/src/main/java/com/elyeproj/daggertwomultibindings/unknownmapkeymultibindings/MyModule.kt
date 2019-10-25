package com.elyeproj.daggertwomultibindings.unknownmapkeymultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

import com.elyeproj.daggertwomultibindings.unknownmapkeymultibindings.RandomStringUtil.randomStringGenerator
import java.util.AbstractMap

@Module
object MyModule {
    @JvmStatic @Provides @IntoSet
    fun entryOne(): Map.Entry<String, String> {
        val key = randomStringGenerator()
        val value = "Random Value 1"
        return AbstractMap.SimpleEntry(key, value)
    }

    @JvmStatic @Provides @IntoSet
    fun entryTwo(): Map.Entry<String, String> {
        val key = randomStringGenerator()
        val value = "Random Value 2"
        return AbstractMap.SimpleEntry(key, value)
    }
}
