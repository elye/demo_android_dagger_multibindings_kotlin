package com.elyeproj.daggertwomultibindings.subcomponentmultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey

@Module
object ParentModule {
    @JvmStatic @Provides @IntoSet
    fun string1() = "parent string 1"

    @JvmStatic @Provides @IntoSet
    fun string2() = "parent string 2"

    @JvmStatic @Provides @IntoMap @StringKey("a")
    fun stringA() = "parent string A"

    @JvmStatic @Provides @IntoMap @StringKey("b")
    fun stringB() = "parent string B"
}
