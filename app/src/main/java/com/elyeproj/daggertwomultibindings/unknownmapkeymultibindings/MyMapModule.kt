package com.elyeproj.daggertwomultibindings.unknownmapkeymultibindings

import dagger.Module
import dagger.Provides

@Module(includes = [MyModule::class])
object MyMapModule {
    @JvmStatic @JvmSuppressWildcards @Provides
    fun randomKeyValueMap(entries: Set<Map.Entry<String, String>>): Map<String, String> {
        return entries.associateBy({ it.key }, { it.key })
    }
}
