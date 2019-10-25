package com.elyeproj.daggertwomultibindings.mapmultibindings

import java.math.BigDecimal

import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
object MyModule {
    @JvmStatic @Provides @IntoMap @StringKey("foo")
    fun provideFooValue() = 100L

    @JvmStatic @Provides @IntoMap @StringKey("boo")
    fun provideBooValue() = 200L

    @JvmStatic @Provides @IntoMap @ClassKey(Thing::class)
    fun provideThingValue() = "value for Thing"

    @JvmStatic @Provides @IntoMap @MyEnumKey(MyEnum.ABC)
    fun provideABCValue() = "value for ABC"

    @JvmStatic @Provides @IntoMap @MyNumberClassKey(BigDecimal::class)
    fun provideBigDecimalValue() = "value for BigDecimal"
}
