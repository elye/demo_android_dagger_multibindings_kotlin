package com.elyeproj.daggertwomultibindings.subcomponentmultibindings

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey

@Module
object ChildModule {
    @JvmStatic @Provides @IntoSet
    fun string3() = "child string 3"

    @JvmStatic @Provides @IntoSet
    fun string4() = "child string 4"

    @JvmStatic @Provides @IntoMap @StringKey("c")
    fun stringC() = "child string C"

    @JvmStatic @Provides @IntoMap @StringKey("d")
    fun stringD() = "child string D"
}
